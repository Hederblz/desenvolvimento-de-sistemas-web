import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`);
    val preco = arrayOf(4.00,4.50,5.00,2.00,1.50);
    val codigo:Int = scan.nextInt();
    val quantidade:Double = scan.nextDouble();
    val resultado:Double = quantidade * preco[codigo - 1];

    println("Total: R$ %.2f".format(resultado));
}
