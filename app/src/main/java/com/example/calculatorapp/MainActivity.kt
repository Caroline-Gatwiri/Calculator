package com.example.calculatorapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var num1 by remember {
                mutableStateOf("0")
            }
            var num2 by remember {
                mutableStateOf("0")
            }

            Column {
                TextField(value = num1, onValueChange = {
                    num1  = it
                })
                TextField(value = num2, onValueChange = {
                    num2  = it
                })
                
                Button(onClick = {
                    var result =  num1.toInt() + num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Add")
                }
                Button(onClick = {
                    var result =  num1.toInt() - num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Subtract")
                }
            }

        }
    }
}

