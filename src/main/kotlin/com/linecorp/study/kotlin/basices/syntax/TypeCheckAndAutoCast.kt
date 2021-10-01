package com.linecorp.study.kotlin.basices.syntax

fun main() {
    println(parseToString("d"))
    println(parseToString(1))
    println(parseToString(22L))
}
fun parseToString(obj: Any): String? {
    if (obj is String) {
        return obj
    }
    if (obj is Int) {
        // sau câu lệnh is. block bên trong, obj sẽ auto được case về int
        return obj.toString()
    }
    if (obj is Long) {
        // sau câu lệnh is. block bên trong, obj sẽ auto được case về Long
        return obj.toString()
    }

    return null
}