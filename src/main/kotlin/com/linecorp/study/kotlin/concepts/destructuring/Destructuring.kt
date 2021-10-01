package com.linecorp.study.kotlin.concepts.destructuring

class StudentDestructuring(val name: String, val age: Int) {
    operator fun component1(): Any {
        return name;
    }

    operator fun component2(): Any {
        return age;
    }
}

fun main() {
    val a = StudentDestructuring("Thành", 201)
    val (name, age) = a
    println("$name $age")
}