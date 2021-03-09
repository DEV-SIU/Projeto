package one.digitalnnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf:String = "123.456.789.10"
    //Private set vai privar o setar das variaveis externos
    private set

}

fun main() {
    val lucas = Pessoa()
    println(lucas)
    println(lucas.nome)
    println(lucas.cpf)
}