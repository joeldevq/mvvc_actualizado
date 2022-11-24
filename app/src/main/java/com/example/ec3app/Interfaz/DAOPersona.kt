package com.example.ec3app.Interfaz

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.ec3app.Modelo.Persona

@Dao
interface DAOPersona {
    @Query("Select * from Persona")
    fun ListarPersonas(): List<Persona>


    @Insert
    suspend fun agregarpersona(personas:List<Persona>):List<Long>

    @Delete
    suspend fun eliminarpersona(persona:Persona):Int

    @Update
    suspend fun actualizarpersona(persona:Persona):Int

}