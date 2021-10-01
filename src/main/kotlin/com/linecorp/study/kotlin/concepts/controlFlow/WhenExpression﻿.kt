package com.linecorp.study.kotlin.concepts.controlFlow

fun main() {
    // when biểu thức
    println(
        "Data char is ${
            when (1) {
                1 -> "Một"
                2 -> "Hai"
                else -> "Không có"
            }
        }  "
    )
    // statment
    when (1) {
        1 -> {
            println("Một")
        }
        2 -> {
            println("hai")
        }
        else -> "Không có"
    }


    when (1) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}