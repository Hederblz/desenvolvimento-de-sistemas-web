import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val a = scan.nextLine()
    val b = scan.nextLine()
    val c = scan.nextLine()


       if (a == "vertebrado" && b == "ave" && c == "carnivoro"){
           println("aguia")
       } else if(a == "vertebrado" && b == "ave" && c == "onivoro") {
           println("pomba")
       }else if (a == "vertebrado" && b == "mamifero" && c == "onivoro") {
           println("homem")
       }else if(a == "vertebrado" && b == "mamifero" && c == "herbivoro") {
            println("vaca")
        }else if(a == "invertebrado" && b == "inseto" && c == "hematofago") {
            println("pulga")
        }else if(a == "invertebrado" && b == "inseto" && c == "herbivoro") {
            println("lagarta")
       }else if(a == "invertebrado" && b == "anelideo" && c == "hematofago") {
           println("sanguessuga")
       }else if(a == "invertebrado" && b == "anelideo" && c == "onivoro") {
           println("minhoca")
       }
}