package com.example.ejemplo3tarjetaidgs904.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

// Nueva función para mostrar los detalles del personaje
@Composable
fun DetallesPersonaje(personaje: PersonajeTarjeta) {
    Column(modifier = Modifier.padding(start = 8.dp)) {
        Personaje(personaje.nombre, MaterialTheme.colorScheme.primary, MaterialTheme.typography.titleLarge)
        Personaje(personaje.descripcion, MaterialTheme.colorScheme.onBackground, MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun Personaje(name: String, color: Color, style: TextStyle){
    Text(text = name)
}