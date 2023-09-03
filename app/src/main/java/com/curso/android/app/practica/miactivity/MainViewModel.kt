package com.curso.android.app.practica.miactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainViewModel : ViewModel(){

    val textos: LiveData<Textos> get() = _textos



    private var _textos = MutableLiveData<Textos>(Textos("",""))

/*
    private fun updateTextos(texto1 : String, texto2 : String){
        viewModelScope.launch {
            _textos.value = Textos(texto1,texto2)


        }
    }*/


    fun compararTextos(texto1: String, texto2: String) :String{

       // updateTextos(texto1 , texto2)

        if(texto1 == texto2){
            return "Los textos ingresados son iguales"
        }else{

            return "Los textos ingresados son distintos"
        }
    }
}