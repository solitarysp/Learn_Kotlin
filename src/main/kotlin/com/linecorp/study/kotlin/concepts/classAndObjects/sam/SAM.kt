package com.linecorp.study.kotlin.concepts.classAndObjects.sam

fun interface SamTest {
    fun test(bol: Boolean): Boolean;
}

fun main() {
    val daoNguoc = SamTest { bol -> !bol }
    println(daoNguoc.test(true))
}
