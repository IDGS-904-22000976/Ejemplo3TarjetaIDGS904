package com.example.ejemplo3tarjetaidgs904

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ejemplo3tarjetaidgs904.Screen.Tarjeta
import com.example.ejemplo3tarjetaidgs904.Screen.personajes
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplo3tarjetaidgs904.ui.theme.Ejemplo3TarjetaIDGS904Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo3TarjetaIDGS904Theme {
                Column(modifier = Modifier.fillMaxSize()) {
                    Tarjeta(personajes)
                }
            }
        }
    }
}

