/*
4) Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
terminar quando for lido um número negativo.
 */

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var saida:Double = 0.0
    val scan = Scanner(System.`in`)
    var numeros: ArrayList<Double> = ArrayList()

    do {
        println("Digite um valor negativo para sair")
        println("Digite um numero : ")
        saida = scan.nextDouble()
        numeros.add(saida)

    }while (saida >= 0.0)

    val intervalo1:Int = numEntreZeroVinteCinco(numeros)
    val intervalo2:Int = numEntreVinteSeisCinquenta(numeros)
    val intervalo3:Int = numEntreCinquentaUmSetentaCinco(numeros)
    val intervalo4:Int= numEntreSetentaSeisCem(numeros)

    println("Enter [0 - 25] tem $intervalo1")
    println("Enter [26 - 50] tem $intervalo2")
    println("Enter [51 - 75] tem $intervalo3")
    println("Enter [76 - 100] tem $intervalo4")

}

fun numEntreZeroVinteCinco(arr:ArrayList<Double>): Int {
    var zeroVinteCinco:Int = 0
    for(i in arr){
        if(i in 0.0..25.0){
            zeroVinteCinco++
        }
    }
    return zeroVinteCinco
}

fun numEntreVinteSeisCinquenta(arr:ArrayList<Double>): Int {
    var vinteSeisCinquenta:Int = 0
    for(i in arr){
        if(i in 26.0..50.0){
            vinteSeisCinquenta++
        }
    }
    return vinteSeisCinquenta
}

fun numEntreCinquentaUmSetentaCinco(arr:ArrayList<Double>): Int {
    var cinquentaUmSetentaCinco:Int = 0
    for(i in arr){
        if(i in 51.0..75.0){
            cinquentaUmSetentaCinco++
        }
    }
    return cinquentaUmSetentaCinco
}

fun numEntreSetentaSeisCem(arr:ArrayList<Double>): Int {
    var setentaSeisCem:Int = 0
    for(i in arr){
        if(i in 76.0..100.0){
            setentaSeisCem++
        }
    }
    return setentaSeisCem
}