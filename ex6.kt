/*
6) Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.
 */

fun main(){
    for (i in 100..200){
        if(i % 2 != 0){
            println(i)
        }
    }
}