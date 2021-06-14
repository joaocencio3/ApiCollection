package com.cencio.joao

fun main() {
    val joao = Funcionario(nome = "João Victor", salario = 2500.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro Henrique", salario = 3700.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria Madalena", salario = 2800.0, tipoContratacao = "CLT")

    val funcionarios = mutableListOf(joao, maria) //lista mutavel, ou seja, pode ser alterada (add ou exluir item)

    println("LIST")
    funcionarios
        .forEach{ println(it) }
    println("")

    funcionarios.add(pedro) //adiciona Pedro
    funcionarios
        .forEach{ println(it) }
    println("")

    funcionarios.remove(joao) //remove joao
    funcionarios
        .forEach{ println(it) }
    println("")

    println("SET")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet
        .forEach{println(it)}
    println("")

    funcionariosSet.add(pedro) //adiciona Pedro
    funcionariosSet.add(maria) //adiciona Maria
    funcionariosSet
        .forEach{println(it)}
    println("")

    funcionariosSet.remove(maria) //remove Maria
    funcionariosSet
        .forEach{println(it)}
    println("")
}