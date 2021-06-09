package com.rule.proyectou2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment

// 17100258 Raúl César Montes Rosales
class Pregunta1Fragment : Fragment(){

    companion object {
         var Respuesta: Int = 0
         var blnRespuestaSeleccionada: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_pregunta_one, container, false)
        perform(view)
        return view
    }

    fun perform(view: View) {
        val rdbR1P1: RadioButton = view.findViewById(R.id.rdbR1)
        val rdbR2P1: RadioButton = view.findViewById(R.id.rdbR2)
        val rdbR3P1: RadioButton = view.findViewById(R.id.rdbR3)
        val rdbR4P1: RadioButton = view.findViewById(R.id.rdbR4)


        rdbR1P1.setOnClickListener {
            if(rdbR1P1.isChecked) {
                Respuesta = 100
            }
            blnRespuestaSeleccionada = true
        }
        rdbR2P1.setOnClickListener {
            if(rdbR2P1.isChecked) {
                Respuesta = 75
            }
            blnRespuestaSeleccionada = true
        }
        rdbR3P1.setOnClickListener {
            if(rdbR3P1.isChecked) {
                Respuesta = 50
            }
            blnRespuestaSeleccionada = true
        }
        rdbR4P1.setOnClickListener {
            if(rdbR4P1.isChecked) {
                Respuesta = 25
            }
            blnRespuestaSeleccionada = true
        }

    }


}

