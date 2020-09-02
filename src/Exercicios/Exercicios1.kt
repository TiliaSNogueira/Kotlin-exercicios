package Exercicios

fun main (){
    println(recebeNumeros(5, 9, 3))


}

fun recebeNumeros(numero1 : Int, numero2: Int, numero3: Int): Int {
    var numeroMaior =0

    if (numero1 > numero2) {
          numeroMaior = numero1
      } else {
        numeroMaior = numero2
    }

        if (numero3 > numeroMaior){
          numeroMaior = numero3
      }

    return  numeroMaior
}