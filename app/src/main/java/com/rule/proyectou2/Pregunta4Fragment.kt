package com.rule.proyectou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton

// 17100258 Raúl César Montes Rosales
class Pregunta4Fragment : Fragment() {
    companion object {
        var Respuesta: Int = 0
        var blnRespuestaSeleccionada: Boolean = false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_pregunta_four, container, false)
        perform(view)
        return view
    }

    fun perform(view: View) {
        val rdbR1P3: RadioButton = view.findViewById(R.id.rdbR1)
        val rdbR2P3: RadioButton = view.findViewById(R.id.rdbR2)
        val rdbR3P3: RadioButton = view.findViewById(R.id.rdbR3)
        val rdbR4P3: RadioButton = view.findViewById(R.id.rdbR4)

        rdbR1P3.setOnClickListener {
            if(rdbR1P3.isChecked) {
                Respuesta = 100
            }
            blnRespuestaSeleccionada = true
        }
        rdbR2P3.setOnClickListener {
            if(rdbR2P3.isChecked) {
                Respuesta = 75
            }
            blnRespuestaSeleccionada = true
        }
        rdbR3P3.setOnClickListener {
            if(rdbR3P3.isChecked) {
                Respuesta = 50
            }
            blnRespuestaSeleccionada = true
        }
        rdbR4P3.setOnClickListener {
            if(rdbR4P3.isChecked) {
                Respuesta = 25
            }
            blnRespuestaSeleccionada = true
        }
    }
}