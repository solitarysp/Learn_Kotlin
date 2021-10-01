package com.linecorp.study.kotlin.concepts.classAndObjects.`class`


abstract class AbstractDemoStudent {
    abstract fun run();
}

class AbstractDemoStudentImpl : AbstractDemoStudent() {
    override fun run() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val s = AbstractDemoStudentImpl();
    println(s.hashCode())
}