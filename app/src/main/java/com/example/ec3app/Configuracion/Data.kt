package com.example.ec3app.Configuracion

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ec3app.Interfaz.DAOPersona
import com.example.ec3app.Modelo.Persona

@Database(
    entities = [Persona::class],
    version = 1,
    exportSchema = false
)
abstract class Data:RoomDatabase() {
    abstract fun daopersona():DAOPersona
}