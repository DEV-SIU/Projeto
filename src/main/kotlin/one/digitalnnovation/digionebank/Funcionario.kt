package one.digitalnnovation.digionebank


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract  fun  CalculoAuxilio(): Double;

    protected  abstract  fun Total(): Double;

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${CalculoAuxilio()}
        Total: ${Total()}
    """.trimIndent()
    }
