package com.pruebasj93.pruebaandroid1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.alert

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alert("Hola 2")
        {
            positiveButton("Aceptar"){}
        }.show()
    }
}
