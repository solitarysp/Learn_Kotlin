package com.linecorp.study.kotlin.basices.syntax

fun main() {
    var names = listOf<String>("thanh", "tuấn");
    for (name in names) {
        println("name:$name")
    }
    val nameFind = "hải";

    println(
        "Find: $nameFind và ${
            when {
                nameFind in names -> "Tìm thấy"
                else -> "không tìm thấy"
            }}")



    names.filter { s -> s.startsWith("t") }.map { s -> s.toUpperCase() }.forEach { s -> print(s) }
}