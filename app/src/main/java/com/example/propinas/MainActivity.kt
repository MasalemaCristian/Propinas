package com.example.propinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraPropinas()
        }
    }
}

@Composable
fun CalculadoraPropinas() {

    var monto by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf(0.0) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Calculadora de Propinas",
            fontSize = 26.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = monto,
            onValueChange = { monto = it },
            label = { Text("Monto de la cuenta") }
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Selecciona el porcentaje"
        )

        Spacer(modifier = Modifier.height(15.dp))



        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Propina calculada: $resultado  ($)",
            fontSize = 22.sp
        )
    }


    }