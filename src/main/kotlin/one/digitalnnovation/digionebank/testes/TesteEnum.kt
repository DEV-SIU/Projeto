package one.digitalnnovation.digionebank.testes

import one.digitalnnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        //println("${elemento.name} ${elemento.descricao} ")

    }

    ClienteTipo.values().forEach {
        //println("${it.name} ${it.descricao} ")

    }

    val pf = ClienteTipo.PF
    val  pj = ClienteTipo.PJ
    println("${pf.name} ${pf.descricao} ")
    println("${pj.name} ${pj.descricao} ")
}