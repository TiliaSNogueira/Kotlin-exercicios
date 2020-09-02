package Exercicios

fun main (){
    println(analisaTextos("Tília", "Tília"))


}

fun analisaTextos(texto1: String, texto2: String) : Boolean {

    if(texto1==texto2){
        return true
    } else {
        return false
    }


}