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
            Horizontal()
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Horizontal() {
    Column {
        Row {
            Column {
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

        Column {
            Row {
                Button(onClick = {})

                {
                    Text("1")
                }

                Button(onClick = {})

                {
                    Text("4")
                }
                Button(onClick = {})

                {
                    Text("7")
                }
            }
        }
        Column {

            Row {
                Button(onClick = {})

                {
                    Text("2")
                }

                Button(onClick = {})

                {
                    Text("5")
                }
                Button(onClick = {})

                {
                    Text("8")
                }
            }
        }

        Column {
            Row {
                Button(onClick = {})

                {
                    Text("3")
                }

                Button(onClick = {})

                {
                    Text("6")
                }
                Button(onClick = {})

                {
                    Text("9")
                }
            }

        }
    }
}
