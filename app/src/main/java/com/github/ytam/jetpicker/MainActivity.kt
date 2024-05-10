package com.github.ytam.jetpicker

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.ytam.jetpicker.ui.theme.JetPickerTheme
import com.github.ytam.picker.JetPickerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPickerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        JetPickerView(
                            modifier = Modifier
                                .padding(32.dp)
                                .align(Alignment.Center),
                            textModifier = Modifier.padding(8.dp),
                            listItems = (1..100).toList().map { it.toString() },
                            endText = "Age"
                        ) {
                            Log.d("MainActivity", "Age = $it")
                        }
                    }
                }
            }
        }
    }
}


@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_UNDEFINED, showBackground = true)
@Preview(name = "Full Preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetPickerTheme {
        JetPickerView(
            modifier = Modifier
                .padding(32.dp),
            textModifier = Modifier.padding(8.dp),
            listItems = (1..100).toList().map { it.toString() },
            endText = "Age"
        ) {
            Log.d("MainActivity", "Age = $it")
        }
    }
}