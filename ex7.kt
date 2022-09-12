/*
7) Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
 */

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var tabuada:Int = 0
    println("Digite um numero : ")
    val N:Int = scan.nextInt()

    for (i in 1..10){
        tabuada = N * i
        println("$i x $N = $tabuada")
    }

}