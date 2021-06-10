package com.cencio.joao

fun main() {
    val values = IntArray(5)

    values[0] = 5
    values[1] = 9
    values[2] = 10
    values[3] = 7
    values[4] = 6

    for (valor in values) {
        println(valor)
    }
    println("")

    values.forEach { valor ->
        println(valor)
    }
    println("")

    for (index in values.indices){
        println(values[index])
    }
    println("")

    values.sort()
    for (valor in values){
        println(valor)
    }
    println("")
}