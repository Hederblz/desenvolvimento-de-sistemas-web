import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val salario:Double = scan.nextDouble()

    if(salario in 0.00..2000.00){
        println("Isento")
    }else if (salario in 2000.01..3000.00){
        val imposto = ((salario - 2000.00) * 0.08)
        println("R$ %.2f".format(imposto))
    }else if(salario in 3000.01..4500.00){
        val imposto = ((salario - 3000.00) * 0.18 + 0.08 * (salario - 2000 - (salario - 3000)))
        println("R$ %.2f".format(imposto))
    }else if(salario > 4500.00){
        val imposto = ((salario - 4500.00) * 0.28 + 0.18 * (salario - 3000.00 - (salario - 4500.00)) + 0.08 * (salario - 3500.00 - (salario - 4500.00)))
        println("R$ %.2f".format(imposto))
    }
}