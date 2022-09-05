import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val salario:Double = scan.nextDouble()

    if (salario in 0.0..400.00){
        val reajuste = 0.15
        val novoSalario = salario + (salario * reajuste)
        val ganho = novoSalario - salario

        println("Novo salario: %.2f".format(novoSalario))
        println("Reajuste ganho: %.2f".format(ganho))
        println("Em percentual: 15 %")
    } else if (salario in 400.01..800.00){
        val reajuste = 0.12
        val novoSalario = salario + (salario * reajuste)
        val ganho = novoSalario - salario

        println("Novo salario: %.2f".format(novoSalario))
        println("Reajuste ganho: %.2f".format(ganho))
        println("Em percentual: 12 %")
    } else if (salario in 800.01..1200.00){
        val reajuste = 0.1
        val novoSalario = salario + (salario * reajuste)
        val ganho = novoSalario - salario

        println("Novo salario: %.2f".format(novoSalario))
        println("Reajuste ganho: %.2f".format(ganho))
        println("Em percentual: 10 %")
    } else if (salario in 1200.01..2000.00){
        val reajuste = 0.07
        val novoSalario = salario + (salario * reajuste)
        val ganho = novoSalario - salario

        println("Novo salario: %.2f".format(novoSalario))
        println("Reajuste ganho: %.2f".format(ganho))
        println("Em percentual: 7 %")
    } else if (salario > 2000.00){
        val reajuste = 0.04
        val novoSalario = salario + (salario * reajuste)
        val ganho = novoSalario - salario

        println("Novo salario: %.2f".format(novoSalario))
        println("Reajuste ganho: %.2f".format(ganho))
        println("Em percentual: 4 %")
    }
}
