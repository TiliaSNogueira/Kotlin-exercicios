package Exercicios

fun main(){
 imprime()

}
fun imprime() {
    for (numero in 0..100) {
        if (numero % 2 != 0) {
            println(numero)
        }
    }
}