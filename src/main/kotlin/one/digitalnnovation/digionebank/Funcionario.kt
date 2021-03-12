package one.digitalnnovation.digionebank


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract  fun  calculoAuxilio(): Double

    protected  abstract  fun total(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
        Total: ${total()}
    """.trimIndent()
    }
