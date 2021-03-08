package one.digitalnnovation.digionebank

class Pessoa {
    val nome: String = "Lucas"
    val cpf:String = "123.456.789.10"
}

fun main() {
    val lucas = Pessoa()
    println(lucas.nome)
    println(lucas.cpf)
}