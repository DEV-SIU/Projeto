package one.digitalnnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"

    //private vai privar as variavel (var ou val) de ser setada ou dar get fora da class pertencente
    /*private var cpf:String = "123.456.789.10"*/

    var cpf:String = "123.456.789.10"

    //Private set vai privar o setar das variavel fora da class,somente poderar setar dentro da propria class
    private set

    //inner class usado para criar um class interna dentro de uma  class
   /* inner class Endereco{
        var rua: String = "Rua das caixibinhas"
    }*/

}

fun main() {
    val lucas = Pessoa()

    //println(lucas)


    println(lucas.nome)
    println(lucas.cpf)


    //chamando class interna
    //println(lucas.Endereco().rua)
}