package com.linecorp.study.kotlin.concepts.classAndObjects.delegation

interface Action {
    fun run();
}

open class Student : Action {
    override fun run() {
        println("Student run")
    }

}

class StudentVip(s: Action) : Action by s {

}

fun main() {
    val s = StudentVip(Student());
    s.run();
}