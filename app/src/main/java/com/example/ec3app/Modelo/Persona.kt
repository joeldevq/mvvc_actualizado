package com.example.ec3app.Modelo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(
    @PrimaryKey(autoGenerate = true)
    var idPersona:Long,
    var nombre:String,
    var apellido:String,
    var correo:String,
    var telefono:String
)
