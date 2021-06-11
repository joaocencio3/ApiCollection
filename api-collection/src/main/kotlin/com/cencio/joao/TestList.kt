package com.cencio.joao

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
) {
    override fun toString(): String = """
        Nome: $nome
        Salário: $salario
        Tipo: $tipoContratacao
    """.trimIndent()
}

fun main() {
    val joao = Funcionario(nome = "João Victor", salario = 2500.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro Henrique", salario = 3700.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria Madalena", salario = 2800.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    println("Lista")
    funcionarios
        .forEach { println(it) } //imprime collection
    println("")

    println("Find")
    println(funcionarios
        .find{it.nome == "Maria Madalena"}) //encontra dentro da collection
    println("")

    println("SortedBy") //organizar collection
    funcionarios
        .sortedBy { it.salario } //organizar pelo salario
        .forEach{ println(it) } //imprime o que foi feita dentro da lista
    println("")

    println("GroupBy") //organizar collection
    funcionarios
        .groupBy { it.tipoContratacao } //organizar pelo salario
        .forEach{ println(it) } //imprime o que foi feita dentro da lista
    println("")
}

