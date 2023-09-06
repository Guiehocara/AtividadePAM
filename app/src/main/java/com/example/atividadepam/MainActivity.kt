package com.example.atividadepam

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividadepam.ui.theme.AtividadePAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtividadePAMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.microsoftteams_image),
                            contentDescription = "teste",
                            modifier = Modifier.size(250.dp)
                        )
                        Button(
                        onClick = 
                        {
                            val text = "Debug"
                            val duration = Toast.LENGTH_SHORT

                            val toast = Toast.makeText(this@MainActivity, text, duration) // in Activity
                            toast.show()
                            Log.i("mensagem", "debug")
                        }
                        
                        ) 
                        {
                            Text(text = "debug")
                        }
                        Button(onClick = {
                            val text = "Info"
                            val duration = Toast.LENGTH_SHORT

                            val toast = Toast.makeText(this@MainActivity, text, duration) // in Activity
                            toast.show()
                            Log.i("mensagem", "info")
                        }) {
                            Text(text = "info")

                        }
                        Button(onClick = {
                            val text = "warning"
                            val duration = Toast.LENGTH_SHORT

                            val toast = Toast.makeText(this@MainActivity, text, duration) // in Activity
                            toast.show()
                            Log.i("mensagem", "warning")
                        }) {
                            Text(text = "warning")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AtividadePAMTheme {
        Greeting("Android")
    }
}