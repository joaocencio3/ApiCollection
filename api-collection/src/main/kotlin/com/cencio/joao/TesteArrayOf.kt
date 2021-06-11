package com.cencio.joao

fun main() {
    val values = intArrayOf(2, 5, 3, 9, 12, 8, 1)

    values.forEach {
        println(it)
    }

    println("-----------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}
