/*
1) Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
três e que se encontram no conjunto dos números de 1 até 500.
 */

fun main(){
    for(i in 1..500) {
        if (i % 2 != 0 && i % 3 == 0) {
            println(i)
        }
    }
}
