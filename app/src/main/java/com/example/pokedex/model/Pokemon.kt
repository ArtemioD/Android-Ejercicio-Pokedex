package com.example.pokedex.model

data class Pokemon(
    val id: Int,
    val name: String,
    val hp: Int,
    val attack: Int,
    val defend: Int,
    val speed: Int,
    val type: Type,
    val url: String
)

enum class Type {
    PLANTA, FUEGO, AGUA, LUCHA, ELECTRICO
}