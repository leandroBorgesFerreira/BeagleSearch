package br.com.bleaglesearch.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Log.d("NavigationActivity", "Creating NavigationGraph")
            NavigationGraph(rememberNavController())
        }
    }

    @Composable
    fun NavigationGraph(navController: NavHostController) {
        Log.d("NavigationGraph", "creating graph")
        NavHost(navController = navController, startDestination = Destinations.TRANSACTIONS.id) {
            composable(Destinations.TRANSACTIONS.id) {
                Log.d("NavigationGraph", "navigating to transactions")
                TransactionsScreen(navigateToHelp = {
                    navController.navigate(Destinations.HELP.id)
                })
            }

            composable(Destinations.HELP.id) {
                Log.d("NavigationGraph", "navigating to help")
                HelpScreen(navigateToTransactions = {
                    navController.navigate(Destinations.TRANSACTIONS.id)
                })
            }
        }
    }
}

enum class Destinations(val id: String) {
    TRANSACTIONS("transactions"), HELP("help"),
}
