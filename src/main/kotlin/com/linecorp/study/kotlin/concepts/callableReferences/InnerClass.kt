package com.linecorp.study.kotlin.concepts.callableReferences

class Outer {
    inner class Inner
}

fun main() {
    val o = Outer()
    val boundInnerCtor = o::Inner
}