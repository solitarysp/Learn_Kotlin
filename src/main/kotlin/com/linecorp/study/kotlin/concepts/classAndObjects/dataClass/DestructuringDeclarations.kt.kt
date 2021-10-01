package com.linecorp.study.kotlin.concepts.classAndObjects.dataClass

data class DestructuringDeclarations(val name: String, val age: Int) {

}

class ClassDestructuringDeclarations(val name: String, val age: Int) {

}

fun main() {
    val a = DestructuringDeclarations("Thành", 21);
    val a1 = ClassDestructuringDeclarations("Tuấn", 25);

    val (name, age) = a;

}