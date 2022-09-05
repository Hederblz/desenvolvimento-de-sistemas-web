import java.util.*

fun main(args: Array<String>){
    val scan = Scanner(System.`in`);
    val primeiraNota:Float = scan.nextFloat();
    val segundaNota:Float = scan.nextFloat();
    val terceiraNota:Float = scan.nextFloat();
    val quartaNota:Float = scan.nextFloat();
    val media:Float = ((primeiraNota * 2 + segundaNota * 3 + terceiraNota * 4 + quartaNota) / 10);

    if(media >= 7.0){
        println("Media: %.1f".format(media));
        println("Aluno aprovado.");
    }else if(media < 5.0){
        println("Media: %.1f".format(media));
        println("Aluno reprovado.");
    }else if(media in 5.0..6.9){
        println("Media: %.1f".format(media));
        println("Aluno em exame.");
        val notaExame:Float = scan.nextFloat();
        println("Nota do exame: %.1f".format(notaExame));
        val mediaFinal:Float = ((media + notaExame) / 2);
        if(mediaFinal >= 5.0){
            println("Aluno aprovado.");
            println("Media final: %.1f".format(mediaFinal));
        }else if(mediaFinal < 4.9){
            println("Aluno reprovado.");
            println("Media final: %.1f".format(mediaFinal));
        }
    }
}
