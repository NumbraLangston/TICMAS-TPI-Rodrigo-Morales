package com.curso.android.app.practica.miactivity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practica.miactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val MainTexto: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.botonComparar.setOnClickListener(){

            binding.textoVista.text = MainTexto.compararTextos(binding.texto1.text.toString(),binding.texto2.text.toString())
        }

    }

}