package com.example.ejemplo3tarjetaidgs904.Screen

data class PersonajeTarjeta(
    val nombre: String,
    val descripcion: String
)

public val personajes: List<PersonajeTarjeta> = listOf(
    PersonajeTarjeta("gohan", "Es un humano con un machete dentro de su mochila"),
    PersonajeTarjeta("vegeta", "El príncipe de los Saiyajin, siempre buscando superar a Goku."),
    PersonajeTarjeta("piccolo", "Un Namekiano sabio y fuerte, mentor de Gohan."),
    PersonajeTarjeta("goku", "El guerrero más fuerte de la Tierra, amante de la comida."),
    PersonajeTarjeta("freezer", "Emperador del mal, enemigo jurado de los Saiyajin."),
    PersonajeTarjeta("cell", "Bio-androide perfecto, creado para ser el guerrero definitivo y darte consejos sobre como ponerte vrgas."),
    PersonajeTarjeta("buu", "Una criatura mágica con múltiples transformaciones."),
    PersonajeTarjeta("trunks", "Hijo de Vegeta y Bulma, un prodigio en el combate."),
    PersonajeTarjeta("krillin", "El mejor amigo de Goku, a pesar de ser más débil."),
    PersonajeTarjeta("Dodoria", "Secuaz de freezer y en su raza es una mujer."),

    )