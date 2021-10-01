package coroutines

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
            println("Dd")

            test1()

            println("Dd2")

        }
        launch {
            println("Dd")

            test1()

            println("Dd2")

        }
    }
}