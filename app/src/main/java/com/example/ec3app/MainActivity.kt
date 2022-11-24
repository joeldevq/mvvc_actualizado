package com.example.ec3app

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ec3app.databinding.ActivityMainBinding
import com.example.ec3app.Adaptador.AdaptadorListado
import com.example.ec3app.ModeloVista.VistaPersona

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var vistapersona: VistaPersona
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //--- Enlazar el ModeloVista con el LiveData
        vistapersona= ViewModelProvider(this).get()
        vistapersona.iniciar()
        binding.listado.apply {
            layoutManager= LinearLayoutManager(applicationContext)
        }

        vistapersona.lista.observe(this, Observer {
            binding.listado.adapter= AdaptadorListado(it)
        })

        binding.btnagregar.setOnClickListener {

        }

    }
}