package com.linecorp.study.kotlin.concepts.functions.functions

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun asListString(vararg ts: String): List<String> {
    val result = ArrayList<String>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main() {
    asList("1", "2", "3")

    val a = arrayOf("1", "2", "3")
    asListString("1", "2", "3",*a)
}