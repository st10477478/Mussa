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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mussa.ui.theme.MussaTheme
import kotlinx.serialization.encoding.AbstractEncoder

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text(text = "Welcome to Mussa!")


                Button(
                    onClick = {
                    }


                ) {
                    Row {
                        Text(text = "song name = sweat dreams")
                        Text(text = "Rating2 = 5/10")
                        Text(text = "Comments : Shery best dance song")

                    }


                    Button(onClick = {
                        val back = Intent(this@MainActivity2, MainActivity::class.java)
                        startActivity(back)

                    }
                    ) { Text(text = "back to home screen") }

                }
            }
        }
    }}

























