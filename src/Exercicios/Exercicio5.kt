package Exercicios

fun main() {
    print(analisaNumeros(20, 18, 10, 15))
}

fun analisaNumeros( numeroA: Int, numeroB: Int, numeroC: Int, numeroD: Int) : Boolean{

    if (numeroA > numeroC && numeroA > numeroD){
        return true
    } else if (numeroB > numeroC && numeroB > numeroD) {
        return true
    } else {
        return false
    }
}