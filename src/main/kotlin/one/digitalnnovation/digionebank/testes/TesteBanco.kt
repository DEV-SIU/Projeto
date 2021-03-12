package one.digitalnnovation.digionebank.testes

import one.digitalnnovation.digionebank.Banco

fun main() {
    val kripsBank = Banco(nome ="KripsBank",numero = 21)
    //.copy copia um val assim poder modificadar valor do mesmo
    val copia = kripsBank.copy(nome = "teste")

    println(kripsBank.info())
    println(copia.info())
}