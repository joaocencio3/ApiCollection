package com.cencio.joao

fun main() {
    val joao = Funcionario(nome = "João Victor", salario = 2500.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro Henrique", salario = 3700.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria Madalena", salario = 2800.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao) //add joao no repositorio
    repositorio.create(pedro.nome, pedro) //add pedro no repositorio
    repositorio.create(maria.nome, maria) //add maria no repositorio

    println(repositorio.findById(joao.nome)) //imprime o joao atraves do id
    println("")

    repositorio.getAll()    //lista tudo o que tem no repositorio
        .forEach{println(it)}
    println("")

    repositorio.remove(maria.nome) //remove maria do repositorio
    repositorio.getAll()    //lista tudo o que tem no repositorio
        .forEach{println(it)}
    println("")

}