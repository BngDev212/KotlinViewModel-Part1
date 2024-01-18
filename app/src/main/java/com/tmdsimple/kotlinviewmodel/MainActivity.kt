package com.tmdsimple.kotlinviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tmdsimple.kotlinviewmodel.ui.theme.KotlinViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinViewModelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    myCounterApp()
                    }
                }
            }
        }
    }

@Composable
fun myCounterApp() {
    var count by remember{ mutableStateOf(0) }
    fun increment(){
        count = count+1
    }
    fun decrement(){
        count--
    }
    //user interface
    Column( modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally ) {
             Text("Counter: $count",
                 fontSize   = 24.sp,
                 fontWeight = FontWeight.Bold)
             Button(onClick = { increment() }) {
                    Text(text = "Increment")
             }
             Button(onClick = { decrement() }) {
                    Text(text = "Decrement")
        }
    }


}



