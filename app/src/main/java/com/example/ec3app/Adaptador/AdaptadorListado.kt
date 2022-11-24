package com.example.ec3app.Adaptador

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3app.Modelo.Persona
import com.example.ec3app.R
import com.example.ec3app.databinding.ListaBinding

class AdaptadorListado(private val data:List<Persona>?): RecyclerView.Adapter<AdaptadorListado.ViewHolder>() {
    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var binding:ListaBinding=ListaBinding.bind(view)
        var contexto:Context = view.context
        fun enlazarDatos(p: Persona){
            binding.foto.setImageResource(R.drawable.ic_baseline_face_24)
            binding.txtcodigo.text=p.idPersona.toString()
            binding.txtnombre.text=p.nombre
            binding.txtapellido.text=p.apellido
            binding.txtcorreo.text=p.correo
            binding.txttelefono.text=p.telefono
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //--Hacemos referencia al componente lista
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lista,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item:Persona?=data?.get(position)
        holder.enlazarDatos(item!!)
    }
    override fun getItemCount()=data!!.size
}