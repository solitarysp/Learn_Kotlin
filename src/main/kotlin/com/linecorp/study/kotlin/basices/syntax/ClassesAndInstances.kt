package com.linecorp.study.kotlin.basices.syntax

import Student

fun main(args: Array<String>) {
    var student1: Student = Student("thanh", 20)
    student1.address = "SG1";
    println(student1.address)
}