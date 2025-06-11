package com.example.ejemplo3tarjetaidgs904.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImagenHeroe(imageName : String) {
    val context= LocalContext.current
    val ImageResid = remember(imageName) {
        context.resources.getIdentifier(imageName.lowercase(),"drawable",context.packageName)
    }
    Image(
        painter = painterResource(id = ImageResid),
        contentDescription = "Imagen del personaje",
        modifier = Modifier
            .padding(4.dp)
            .size(80.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}