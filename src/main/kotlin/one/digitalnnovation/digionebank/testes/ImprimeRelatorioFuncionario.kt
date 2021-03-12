package one.digitalnnovation.digionebank.testes

import one.digitalnnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimir(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}