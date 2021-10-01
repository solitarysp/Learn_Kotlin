package com.linecorp.study.kotlin.concepts.classAndObjects.enum

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class EnumDemo1(val vn: String) {
    WAITING("Chờ") {
        override fun msg() {
            println("Đang $vn")
        }
    },
    RUNNING("Chạy") {
        val km: String = "150"
        override fun msg() {
           println("$vn $km km")
        }
    };
    abstract fun msg()
}

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

fun main() {
    println(IntArithmetics.TIMES.apply(5,5))

    EnumDemo1.RUNNING.msg();
}