package com.linecorp.study.kotlin.concepts.classAndObjects.properties


class LateInitDemo() {
    lateinit var name: String;
    lateinit var name2: String;
    lateinit var name3: String;
}

fun main() {
    DemoNotInitData()
}

private fun DemoNotInitData() {
    try {
        val a = LateInitDemo();
        a.name = "thanh";
        println(a.name)
        println(a.name2)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}