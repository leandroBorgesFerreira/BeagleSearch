package br.com.bleaglesearch.sample

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HelpScreen(navigateToTransactions: () -> Unit) {
    Log.d("HelpScreen", "HelpScreen")

    Box(modifier = Modifier.fillMaxSize()) {
        Text("HelpScreen", modifier = Modifier.align(alignment = Alignment.Center))

        Button(
            onClick = navigateToTransactions,
            modifier = Modifier.align(alignment = Alignment.BottomCenter)
        ) {
            Text(text = "Go to Transactions")
        }
    }
}
