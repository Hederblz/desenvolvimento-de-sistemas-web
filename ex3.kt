/*
3) Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.
 */

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    var saida:Any
    val scan = Scanner(System.`in`)
    var notas: ArrayList<Double> = ArrayList()

    do {
        println("Aperte 'q' para sair")
        println("Digite a Nota : ")
        saida = scan.next()
        saida.toDoubleOrNull()?.let { notas.add(it) }

    }while (saida != "q")
    media(notas)
    val notasPositivo:Int = numerosPositivos(notas)
    val notasNegativo:Int = numerosNegativos(notas)
    println("$notasPositivo Notas positivas $notasNegativo Notas negativas")
    val notasPercentualPositivo:Double = percentualPositivo(notas, notasPositivo)
    println("O percentual de notas positiva é $notasPercentualPositivo %")
    val notasPercentualNegativa:Double = percentualNegativa(notas, notasNegativo)
    println("O percentual de notas negativa é $notasPercentualNegativa %")

}

fun media(arr:ArrayList<Double>){
    var media:Double = 0.0
    for(i in arr){
        media += i
    }
    media /= arr.size
    return println("A media é : $media")
}

fun numerosPositivos(arr:ArrayList<Double>): Int {
    var positivo:Int = 0
    for(i in arr){
        if(i >= 0){
            positivo++
        }
    }
    return positivo
}
fun numerosNegativos(arr:ArrayList<Double>): Int {
    var negativo:Int = 0
    for(i in arr){
        if(i < 0){
            negativo++
        }
    }
    return negativo
}

fun percentualPositivo(arr:ArrayList<Double>, totalNotasPositivo:Int): Double {
    var percentPositivo:Double = 0.0
    percentPositivo = ((totalNotasPositivo * 100) / arr.size).toDouble()
    return percentPositivo
}

fun percentualNegativa(arr:ArrayList<Double>, totalNotasNegativa:Int): Double {
    var percentNegativa:Double = 0.0
    percentNegativa = ((totalNotasNegativa * 100) / arr.size).toDouble()
    return percentNegativa
}
