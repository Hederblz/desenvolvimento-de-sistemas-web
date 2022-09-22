fun main(args: Array<String>) {
    val caminhao = VeiculoDeCarga()
    caminhao.fabricante = "Volkswagen"
    caminhao.modelo = "Volkswagen e-Delivery"
    caminhao.capacidadeDeCarga = 9055

    val van = VeiculoDePasseio()
    van.fabricante = "Mercedes Benz"
    van.modelo = "Sprinter"
    van.arCondicionado = true

    println("nome do fabricante - "+caminhao.fabricante);
    println("nome do modelo - "+caminhao.modelo);
    println("Qual a carga ? "+caminhao.capacidadeDeCarga+"kg");

    println("nome do fabricante - "+van.fabricante);
    println("nome do modelo - "+van.modelo);
    println("tem ar-condicionado ? "+van.arCondicionado);
}