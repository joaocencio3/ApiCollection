package com.cencio.joao

fun main() {
    val joao = Funcionario(nome = "João Victor", salario = 2500.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro Henrique", salario = 3700.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria Madalena", salario = 2800.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(joao, pedro) //conjunto 1
    val funcionarios2 = setOf(maria) //conjunto 2
    val funcionarios3 = setOf(joao, pedro, maria) //conjunto 3

    println("Conjunto funcionarios1")
    funcionarios1
        .forEach { println(it) }
    println("")

    println("Conjunto funcionarios2")
    funcionarios2
        .forEach { println(it) }
    println("")

    println("Conjunto funcionarios3")
    funcionarios3
        .forEach { println(it) }
    println("")

    //União de dois conjuntos
    println("Conjunto unido de dois conjuntos")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion
        .forEach { println(it) }

    //Subtração de um conjunto de outro conjunto
    println("Subtract")
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract
        .forEach { println(it) }
    println("")

    //Imprimir o que tem de comum em dois conjuntos
    println("Intersect")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect
        .forEach { println(it) }
    println("")
}

