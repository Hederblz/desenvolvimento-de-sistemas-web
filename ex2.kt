/*
2) Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
mostrar :
a. A menor altura do grupo;
b. A maior altura do grupo;
 */

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var alturas: ArrayList<Double> = ArrayList()

    for (i in 0..14){
        println("Digite a altura : ")
        val altura:Double = scan.nextDouble()
        alturas.add(altura)
    }
    val max = alturas.maxOrNull() ?: 0
    val min = alturas.minOrNull() ?: 0
    println("A menor é : %.2f".format(min))
    println("A maior é : %.2f".format(max))
}
