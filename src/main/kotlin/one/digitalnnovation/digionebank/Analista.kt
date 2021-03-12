package one.digitalnnovation.digionebank


class Analista(nome: String,
               cpf: String,
               salario: Double,
): Funcionario(nome, cpf, salario) {
    override fun CalculoAuxilio() = (salario * 0.1)
    override fun Total(): Double = (CalculoAuxilio() + salario)
    }

