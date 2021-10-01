package com.linecorp.study.kotlin.concepts.functions.functions

infix fun Int.nhan(x: Int): Int {
    return this * x;
}
fun main() {
    println(5 nhan 3)
}