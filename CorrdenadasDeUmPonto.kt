import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`);
    val x:Float = scan.nextFloat();
    val y:Float = scan.nextFloat();

    if(x == 0F && y == 0F){
        println("Origem");
    }else if(x == 0F){
        println("Eixo Y");
    }else if(y == 0F){
        println("Eixo X");
    }else if(x > 0F && y > 0F){
        println("Q1")
    }else if(x < 0F && y > 0F){
        println("Q2")
    }else if(x < 0F && y < 0F){
        println("Q3")
    }else if(x > 0F && y < 0F){
        println("Q4")
    }
}