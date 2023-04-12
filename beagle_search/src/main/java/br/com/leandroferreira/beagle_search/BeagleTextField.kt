package br.com.leandroferreira.beagle_search

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun BeagleInputText(modifier: Modifier) {
    var text by remember { mutableStateOf("") }

    TextField(
        text,
        onValueChange = { value -> text = value },
        modifier = modifier
    )
}
