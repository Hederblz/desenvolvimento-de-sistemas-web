/*
10) Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
 */

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var progressao:Int = 0
    println("Digite o valor inicial : ")
    var A:Int = scan.nextInt()
    var numero:Int = A
    var resultado:String = "$numero! = $numero"

    for (i in A downTo 1){
        if (i == A) continue
        A *= i
        resultado += " x $i"
        if (i == 1) resultado += " = $A"
    }
    print(resultado)
}