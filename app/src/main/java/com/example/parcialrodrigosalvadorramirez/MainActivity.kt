package com.example.parcialrodrigosalvadorramirez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EjercicioElseIf()
        EjercicioWhen()
        EjercicioBucle()
    }

    private fun EjercicioElseIf(){

        var color = "Azul"
        if(color == "Celeste"){
            println("El color seleccionado es $color")
        }else if(color == "Verde"){
            println("El color seleccionado es $color")}
        else if(color == "Amarillo"){
            println("El color seleccionado es $color")}
        else if(color == "Azul"){
            println("El color seleccionado es $color")}
        else if(color == "Negro"){
            println("El color seleccionado es $color")}
        else{
            println("El color no ha sido encontrado")}
    }

    private fun EjercicioWhen() {
        var comida = "Hot Dog"

        when(comida){
            "Pupusas", "Elotes Locos", "Atol de Elote" ->{
                println("El pais al que pertenece es El Salvador")  }
            "Tacos", "Pozole" ->{
                println("El pais al que pertenece es Mexico")  }
            "Pizza", "Lasaña", "Ravioles" ->{
                println("El pais al que pertenece es Italia")  }
            "Hot Dog", "Hamburguesa" ->{
                println("El pais al que pertenece es EEUU")  }
            else ->{
                println("No se conoce el pais de origen del Platillo")  }
        }
    }

    private fun EjercicioBucle(){
        var x = 15
        println("Valores de 1 en 1")
        for(valor in 0..x) {
            println(valor)
        }
        println("Valores de 2 en 2")
        for(valor in 0..x step 2){  println(valor)
        }
        println("Valores de 1 en 1 hacia abajo")
        for(valor in x downTo 0){  println(valor)
        }
        println("Valores de 3 en 3 hacia abajo")
        for(valor in x downTo 0 step 3){  println(valor)
        }
    }

}