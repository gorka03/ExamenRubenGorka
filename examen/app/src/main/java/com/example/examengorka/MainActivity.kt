package com.example.examengorka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Examen()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Examen() {
    Column {
        Row {
            Column {
                Text("")
                Text("")
                Text("Hello Android!!")
            }

            Column {
                Row {
                    Text("Hello Android!!")
                }
                Row {
                    Text("Hello Android!!")
                }
                Row {
                    Text("Hello Android!!")
                }

            }
        }

        Row {
            Text("Hello Android!!")

        }

        Row {
            Column {

                Button(onClick = {})

                {
                    Text("1")
                }

                Button(onClick = {})

                {
                    Text("2")
                }
                Button(onClick = {})

                {
                    Text("3")
                }
            }

            Column {

                Button(onClick = {})

                {
                    Text("4")
                }

                Button(onClick = {})

                {
                    Text("5")
                }
                Button(onClick = {})

                {
                    Text("6")
                }
            }
            Column {

                Button(onClick = {})

                {
                    Text("7")
                }

                Button(onClick = {})

                {
                    Text("8")
                }
                Button(onClick = {})

                {
                    Text("9")
                }
            }

        }
    }
}

