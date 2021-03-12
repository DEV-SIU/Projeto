package one.digitalnnovation.digionebank

 class Gerente(
     nome: String,
     cpf: String,
     salario: Double
 ) : Funcionario(nome = nome,cpf = cpf,salario = salario) {
     override fun CalculoAuxilio(): Double = salario * 0.4

     override fun Total(): Double = CalculoAuxilio() + salario
 }