package one.digitalnnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
){

    fun info() = "Nome do Banco:\n$nome\nNumero do Banco:\n$numero"
}
