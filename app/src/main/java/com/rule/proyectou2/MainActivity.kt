package com.rule.proyectou2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar

// 17100258 Raúl César Montes Rosales

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnComenzar: Button = findViewById(R.id.btnComenzar)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        btnComenzar.setOnClickListener {
            val intent = Intent(this, InicioPreguntaActivity::class.java)
            startActivity(intent)
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