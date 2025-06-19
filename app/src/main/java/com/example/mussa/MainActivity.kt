package com.example.mussa

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mussa.ui.theme.MussaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text(text = "Welcome to Musa!")

                Button(
                    onClick = {
                        val beyonce = Intent(this@MainActivity, MainActivity2::class.java)
                        startActivity(beyonce)

                    }

                ) {
                    Text(text = "Beyonce")

                }

                Button(onClick = {
                    val LanaDelRay = Intent(this@MainActivity, MainActivity3::class.java)
                    startActivity(LanaDelRay)
                }
                ) { }
            }
        }
    }
}















