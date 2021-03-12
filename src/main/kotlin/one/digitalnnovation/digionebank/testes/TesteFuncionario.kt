package one.digitalnnovation.digionebank.testes

import one.digitalnnovation.digionebank.Funcionario
import one.digitalnnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val lucas = Pessoa("Lucas","123456789")
    //println(lucas)
    //println(lucas.informacao())
    println(lucas.nome)
    println(lucas.cpf)
    val rodrigo = Funcionario("Rodrigo","12345678910", BigDecimal.valueOf(2000.0))
    println("${rodrigo.nome}\n${rodrigo.cpf}\n${rodrigo.salario}")
}