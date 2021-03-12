package one.digitalnnovation.digionebank.testes

import one.digitalnnovation.digionebank.Analista


fun main() {
    val rodrigo = Analista("Rodrigo","12345678910", 1500.0)
    //println("${rodrigo.nome}\n${rodrigo.cpf}\n${rodrigo.salario}")
    ImprimeRelatorioFuncionario.imprimir(rodrigo)
}
