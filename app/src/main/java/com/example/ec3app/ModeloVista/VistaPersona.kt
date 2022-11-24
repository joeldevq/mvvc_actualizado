package com.example.ec3app.ModeloVista

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ec3app.Configuracion.AppData.Companion.db
import com.example.ec3app.Modelo.Persona
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VistaPersona:ViewModel(){
    val lista=MutableLiveData<List<Persona>?>()
    fun iniciar(){
        viewModelScope.launch {
            lista.value= withContext(Dispatchers.IO){
                db.daopersona().agregarpersona(arrayListOf<Persona>(
                    Persona(0,"CESAR","MENDIETA CUEVA","cueva22@gmail.com","456753"),
                    Persona(0,"RICHARD","SAAVEDRA SANTIN","sasa2022@gmail.com","786543"),
                    Persona(0,"DENNIS","JARAMILLO ORTIZ","jara22@gmail.com","564321")
                ))
               db.daopersona().ListarPersonas()
            }
        }
    }
    ///----- Agregar Registros ---
    ///----- Eliminar Registros ---

}