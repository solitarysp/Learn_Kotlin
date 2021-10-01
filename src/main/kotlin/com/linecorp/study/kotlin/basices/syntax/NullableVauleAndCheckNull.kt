package com.linecorp.study.kotlin.basices.syntax

fun main() {
    println(parseInt(1))
    println(parseInt("1"))

    val data = parseInt(1);
    if (data == null) {
        println("Data là null")
    }
}

fun parseInt(data: Any): Int? {
    if (data is String) {
        return data.toInt();

    }
    return null;
}