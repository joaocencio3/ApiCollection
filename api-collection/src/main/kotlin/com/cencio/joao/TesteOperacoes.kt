package com.cencio.joao

fun main() {
    val salarios = doubleArrayOf(1000.0, 2750.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("")

    println("Max, Min, Average")
    println("${salarios.max()}") //maior salário (Depreciado. Usar MaxOrNull)
    println("${salarios.min()}") //menor salário (Depreciado. Usar MinOrNull)
    println("${salarios.average()}") //média de salários
    println("")

    println("Filter")
    //filtro de salário
    val salariosMaiorQue2500 = salarios.filter { it > 2500 } //filtra os itens dentro da condição e retorna na variavel
    salariosMaiorQue2500.forEach{
        println(it)
    }
    println("")

    println("Count")
    //contar somente quando for verdade
    println(salarios.count{it in 2000.0..5000.0}) //conta os valores dentro da condição e retorna a quantidade
    println("")

    println("Find")
    //Encontrar
    println(salarios.find{it == 2750.0}) //retorna o valor quando encontra
    println(salarios.find{it == 2749.0}) //retorna null quando não encontra
    println("")

    println("Any")
    //Encontrar
    println(salarios.any{it == 2750.0}) //retorna true quando não encontra
    println(salarios.any{it == 500.00}) //retorna false quando não encontra
    println("")

    println("MaxOrNull, MinOrNull")
    println("${salarios.maxOrNull()}") //maior salário, se não tiver devolve Null
    println("${salarios.minOrNull()}") //menor salário, se não tiver devolve Null
    println("")
}