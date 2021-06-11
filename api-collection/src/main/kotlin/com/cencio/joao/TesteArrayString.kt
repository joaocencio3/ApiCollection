package com.cencio.joao

fun main() {
    val teste = arrayOf("1.2.1.10.2 - 3", "1.2.3.1.1 - 4", "1.1.1.1.10 - 1", "1.2.1.2.2 - 2" )
    teste.forEachIndexed{index, salarios ->
        println(teste[index])
    }
    teste.sort()
    println("")
    teste.forEachIndexed{index, salarios ->
        println(teste[index])
    }
}