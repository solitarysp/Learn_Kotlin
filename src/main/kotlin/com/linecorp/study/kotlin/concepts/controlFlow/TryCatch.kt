package com.linecorp.study.kotlin.concepts.controlFlow

// custom một Exception
class ExceptionCustom : Throwable() {

}

fun main() {

    tryCatchDemo();

    tryExpression()

    theNothingType()
}
fun theNothingType() {

    try {
        val s = null ?: throw NullPointerException("Không thể null");

    } catch (e: Exception) {
        println(e.message)
    }
}

private fun tryExpression() {
    println("tryExpression")
    val data = try {
        val a = "1";
        a.toInt();
    } catch (e: Exception) {
        null;
    }
    println(data)
}

fun tryCatchDemo() {
    try {

    } finally {
        println("kết thúc  bắt buộc có 1 catch hoặc finally")
    }
    try {

        throw NullPointerException();
    } catch (e: NullPointerException) {
        println("kết thúc catch NullPointerException")

    }
}
