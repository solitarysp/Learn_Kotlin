package com.linecorp.study.kotlin.basices.syntax

fun main() {
    // kiểm tra 1 số có nằm trong phạm vi
    if (3 in 2..9+1) {
        println(" in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

}