package Exercicios

fun main(){
    println(analisaNumero(2))
}

fun analisaNumero(numero: Int) : Boolean {

    if (numero%2 == 0){
        return true
    } else {
        return false
    }
}