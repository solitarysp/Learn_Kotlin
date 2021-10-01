package com.linecorp.study.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


suspend fun test1() {
    println("start test1")

    delay(10000L)
    println("end test1")

}

 fun main() {
    runBlocking {
        launch {
            println("launch start 1")

            test1()

            println("launch end 1")

        }
        launch {
            println("launch start 2")

            test1()

            println("launch end 2")

        }
    }
}