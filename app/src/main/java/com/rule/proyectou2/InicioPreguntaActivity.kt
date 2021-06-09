package com.rule.proyectou2

import android.animation.ObjectAnimator
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.snackbar.Snackbar
import java.net.InterfaceAddress

// 17100258 Raúl César Montes Rosales



class InicioPreguntaActivity : AppCompatActivity(), View.OnClickListener {


    var intRespuestaRespuesta: Int = 0
    var i: Int = 1
    var fragment : Fragment = Pregunta1Fragment()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_preguntas)

        val btnSiguiente: Button = findViewById(R.id.btnSiguiente)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val pro: ProgressBar = findViewById(R.id.progressBar6)
        pro.max = 100
        pro.progress = 20


        transitar(fragment)
        btnSiguiente.setOnClickListener(this)
    }

    fun transitar(fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val transaccion: FragmentTransaction = manager.beginTransaction()
        transaccion.replace(R.id.framelayoutid, fragment)
        transaccion.commit()
    }



    override fun onClick(v: View?) {


        i++
        when(i){
            2->{
                if(Pregunta1Fragment.blnRespuestaSeleccionada) {

                    val pro: ProgressBar = findViewById(R.id.progressBar6)
                    pro.max = 100
                    pro.progress = 40

                    fragment = Pregunta2Fragment()
                    transitar(fragment)
                    intRespuestaRespuesta += Pregunta1Fragment.Respuesta
                    val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                        "Volver", Snackbar.LENGTH_LONG)
                    mySnackbar.setAction("Volver") {
                        i--
                        fragment = Pregunta1Fragment()
                        transitar(fragment)
                        if(Pregunta1Fragment.Respuesta > 0)
                            intRespuestaRespuesta-= Pregunta1Fragment.Respuesta
                            pro.progress = 20
                    }
                    mySnackbar.show()
                } else {
                    i--
                    val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                    toast.show()
                }
            }

            3->{
                if(Pregunta2Fragment.blnRespuestaSeleccionada) {

                    val pro: ProgressBar = findViewById(R.id.progressBar6)
                    pro.max = 100
                    pro.progress = 60

                    fragment = Pregunta3Fragment()
                    transitar(fragment)
                    intRespuestaRespuesta += Pregunta2Fragment.Respuesta
                    val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                        "Volver", Snackbar.LENGTH_LONG)
                    mySnackbar.setAction("Volver") {
                        i--
                        fragment = Pregunta2Fragment()
                        transitar(fragment)
                        if(Pregunta2Fragment.Respuesta == 1)
                            pro.progress = 40
                            intRespuestaRespuesta--
                    }
                    mySnackbar.show()
                } else {
                    i--
                    val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                    toast.show()
                }
            }

            4->{
                if(Pregunta3Fragment.blnRespuestaSeleccionada) {

                    val pro: ProgressBar = findViewById(R.id.progressBar6)
                    pro.max = 100
                    pro.progress = 80

                    fragment = Pregunta4Fragment()
                    transitar(fragment)
                    intRespuestaRespuesta += Pregunta3Fragment.Respuesta
                    val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                        "Volver", Snackbar.LENGTH_LONG)
                    mySnackbar.setAction("Volver") {
                        i--
                        fragment = Pregunta3Fragment()
                        transitar(fragment)
                        if(Pregunta3Fragment.Respuesta == 1)
                            pro.progress = 60
                            intRespuestaRespuesta--
                    }
                    mySnackbar.show()
                } else {
                    i--
                    val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                    toast.show()
                }
            }

            5->{
                if(Pregunta4Fragment.blnRespuestaSeleccionada) {

                    val pro: ProgressBar = findViewById(R.id.progressBar6)
                    pro.max = 100
                    pro.progress = 100

                    fragment = Pregunta5Fragment()
                    transitar(fragment)
                    intRespuestaRespuesta += Pregunta4Fragment.Respuesta
                    val mySnackbar = Snackbar.make(findViewById(R.id.framelayoutid),
                        "Volver", Snackbar.LENGTH_LONG)
                    mySnackbar.setAction("Volver") {
                        i--
                        fragment = Pregunta4Fragment()
                        transitar(fragment)
                        if(Pregunta4Fragment.Respuesta == 1)
                            pro.progress = 80
                            intRespuestaRespuesta--
                    }
                    mySnackbar.show()
                } else {
                    i--
                    val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                    toast.show()
                }
            }

            else -> {
                if(Pregunta5Fragment.blnRespuestaSeleccionada) {
                    intRespuestaRespuesta += Pregunta5Fragment.Respuesta
                    val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                    builder.setTitle("Resultado")
                    if(intRespuestaRespuesta >= 125 && intRespuestaRespuesta < 250)
                        builder.setMessage("Tu personaje es: Bödvar")
                    else if (intRespuestaRespuesta >= 250 && intRespuestaRespuesta < 375)
                        builder.setMessage("Tu personaje es: Orion")
                    else if (intRespuestaRespuesta >= 375 && intRespuestaRespuesta < 500)
                        builder.setMessage("Tu personaje es: Ada")
                    else
                        builder.setMessage("Tu personaje es: Teros")

                    builder.setPositiveButton("Ok") { dialogInterface: DialogInterface, i: Int ->
                        finish()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        intRespuestaRespuesta = 0
                    }

                    val alertDialog: AlertDialog = builder.create()
                    alertDialog.show()
                } else {
                    i--
                    val toast = Toast.makeText(applicationContext, "Selecciona una respuesta", Toast.LENGTH_LONG)
                    toast.show()
                }

            }




        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        if(id == R.id.aboutUs) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.setTitle("About us")
            builder.setMessage("Created by Raúl César Montes Rosales for the mater de Prog Movil 1. No. de Control: 17100258")
            builder.setPositiveButton("Ok") { dialogInterface: DialogInterface, i: Int ->

            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
        return true
    }
}