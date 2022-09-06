import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val limite:Int = scan.nextInt()
    for (numero in 1..limite step 2){
        println(numero)
    }
}