package com.cencio.joao

fun main() {
    val joao = Funcionario(nome = "João Victor", salario = 2500.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro Henrique", salario = 3700.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria Madalena", salario = 2800.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println("")

    repositorio.getAll()
        .forEach{println(it)}
}