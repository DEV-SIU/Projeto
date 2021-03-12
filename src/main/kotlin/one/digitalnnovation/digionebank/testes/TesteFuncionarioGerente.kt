package one.digitalnnovation.digionebank.testes


import one.digitalnnovation.digionebank.Gerente


fun main() {
    val lucas = Gerente("Lucas","123.456.789.10", 2500.0)
    //println("${rodrigo.nome}\n${rodrigo.cpf}\n${rodrigo.salario}")
    ImprimeRelatorioFuncionario.imprimir(lucas)
}
