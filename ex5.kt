/*
5) Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
números lidos. O número que encerrará a leitura será zero.
 */


import java.util.*
import kotlin.collections.ArrayList


fun main(){
    var saida:Double = -1.0
    val scan = Scanner(System.`in`)
    var numeros: ArrayList<Double> = ArrayList()

    do {
        println("Digite zero para sair")
        println("Digite um numero : ")
        saida = scan.nextDouble()
        if(saida != 0.0 && saida > 0.0){
            numeros.add(saida)
        }

    }while (saida != 0.0)

    val valoresImpares = numerosImpares(numeros)
    println("$valoresImpares Numeros Impares")
    val valoresPares = numerosPares(numeros)
    println("$valoresPares Numeros Pares")
    val valorMediaPar:Double = mediaNumerosPares(numeros,valoresPares)
    println("$valorMediaPar é a media dos valores pares")
    val valorMediaGeral:Double = mediaGeral(numeros)
    println("$valorMediaGeral é a media total")

}


fun numerosImpares(arr:ArrayList<Double>): Int {
    var impar:Int = 0
    for(i in arr){
        if(i%2 != 0.0){
            impar++
        }
    }
    return impar
}

fun numerosPares(arr:ArrayList<Double>): Int {
    var par:Int = 0
    for(i in arr){
        if(i%2 == 0.0){
            par++
        }
    }
    return par
}

fun mediaNumerosPares(arr:ArrayList<Double>, totalPar:Int):Double {
    var par:Double = 0.0
    var mediaPar:Double = 0.0
    for(i in arr){
        if(i%2 == 0.0){
            par += i
        }
    }
    mediaPar = (par/totalPar)
    return mediaPar
}

fun mediaGeral(arr:ArrayList<Double>):Double {
    var total:Double = 0.0
    var media:Double = 0.0
    for(i in arr){
        total += i
    }
    media = (total/arr.size)
    return media
}