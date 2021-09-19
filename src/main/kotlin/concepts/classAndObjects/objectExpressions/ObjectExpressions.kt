package concepts.classAndObjects.objectExpressions

open class Student {
  companion  object ConfigSingleton {
        val name: String = "Demo";
        fun test() {
            println("Demo test")
        }
    }
}

object ConfigSingleton {
    val name: String = "Demo";
    fun test() {
        println("Demo test")
    }
}

fun main() {
    Student.test();

    ConfigSingleton.test();

    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        fun fullMsg() = "$hello $world"
    }
    println(
        helloWorld.fullMsg()
    )

    val studentVip = object : Student() {
        val vip: Boolean = false;
    }
    println(studentVip.vip)
}