package com.linecorp.study.kotlin.concepts.destructuring

class ReturningTwoValues(val data: Any, val error: Any?) {
    operator fun component1(): Any {
        return data;
    }
    operator fun component2(): Any? {
        return error;
    }

}

fun main() {
    val (resul, error) = returningTwoValues();
    println("$resul $error")

}

fun returningTwoValues(): ReturningTwoValues {
    return ReturningTwoValues("Data", null);
}