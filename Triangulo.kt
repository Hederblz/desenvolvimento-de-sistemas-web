import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val a:Double = scan.nextDouble()
    val b:Double = scan.nextDouble()
    val c:Double = scan.nextDouble()

    if(triangulo(a,b,c)){
        val areaDoTrapezio:Double = ((a + b) * c / 2)
        println("Area = %.1f".format(areaDoTrapezio))
    }else{
        val perimetroDoTriangulo:Double = (a + b + c)
        println("Perimetro = %.1f".format(perimetroDoTriangulo))
    }


}

fun triangulo(a:Double,b:Double,c:Double):Boolean{
    val result:Boolean = false
    if(a >= b + c || b >= a + c || c >= a + b){
        return true
    }
    return result;
}