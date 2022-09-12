/*
9) Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
P.G. contendo 10 valores.
 */

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var progressao:Int = 0
    println("Digite o valor inicial : ")
    var A:Int = scan.nextInt()
    println("Digite a razão : ")
    val R:Int = scan.nextInt()

    for (i in 1..10){
        println(A)
        A *= R
    }
}
