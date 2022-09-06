import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val a:Double = scan.nextDouble()
    val b:Double = scan.nextDouble()

    if(multiplo(a,b)){
        println("Sao Multiplos")
    }else{
        println("Nao sao Multiplos")
    }
}

fun multiplo(a:Double,b:Double):Boolean{
    val k:Double = a / b;
    val result:Boolean = false
    if(a > b){
        if((a % b) == 0.0){
            return true
        }else{
            return result
        }
    }else if(b > a){
        if((b % a) == 0.0){
            return true
        }else{
            return result
        }
    }
    return result
}
