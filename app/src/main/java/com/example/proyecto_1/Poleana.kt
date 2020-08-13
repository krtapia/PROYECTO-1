package com.example.proyecto_1

val dadoA = (1..6).shuffled().first()
val dadoB = (1..6).shuffled().first()

fun main(){
    tirarDados()
}

fun tirarDados(){
    print("Los dados son $dadoA y $dadoB \n")

    if (dadoA == 6 && dadoB == 3){
        print("Bajas ficha en la casilla 3")
    }
    else if(dadoA + dadoB == 6) {
        print("Bajas ficha a la casilla 0")

    }
    else if (dadoA == 6 && dadoB == 6){
        print("Baja dos fichas a la casilla 0")
    }
    else{
        print("No bajas ninguna ficha")
    }
}