package com.cencio.joao

fun main() {
    val pair1: Pair<String, Double> = Pair("João", 1000.0)
    val pair2: Pair<String, Double> = Pair("Alexandre", 1500.0)

    val map1 = mapOf(pair1, pair2)
    val map2 = mapOf("Pedro" to 2500.0, "Maria" to 1580.00, "Lucimara" to 4600.0)

    println("Map1")
    map1
        .forEach { (n, s) -> println("Chave: $n - Valor: $s")}
    println("")

    println("Map2")
    map2
        .forEach { (n, s) -> println("Chave: $n - Valor: $s")}
    println("")
}