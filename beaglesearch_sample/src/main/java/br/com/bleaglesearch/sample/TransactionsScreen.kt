package br.com.bleaglesearch.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.leandroferreira.beagle_search.BeagleInputText

@Composable
fun TransactionsScreen(navigateToHelp: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.padding(10.dp)) {
            BeagleInputText(modifier = Modifier.fillMaxWidth())
        }

        Box(modifier = Modifier.fillMaxSize()) {
            Text("TransactionsScreen", modifier = Modifier.align(alignment = Alignment.Center))

            Button(
                onClick = navigateToHelp,
                modifier = Modifier.align(alignment = Alignment.BottomCenter)
            ) {
                Text(text = "Go to Help")
            }
        }
    }

}
