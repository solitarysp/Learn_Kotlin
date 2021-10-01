package com.linecorp.study.kotlin.concepts.classAndObjects.nestedAndInner

class Outer {
    private val bar: Int = 1

    inner class Nested {
        fun foo() = bar;
    }
}

fun main() {
    val demo = Outer().Nested().foo() // == 2
}