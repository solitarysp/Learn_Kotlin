package concepts.classAndObjects.`class`

// không có primary chính
class Student {

}

// Có primary chính cách khai báo 1
class Studnet1(val name: String) {

}

// Có primary chính cách khai báo 2
class Studnet2 constructor(val name: String) {
}
// order init demo
class InitOrderDemo constructor(val name: String) {

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class DefaultParam(age: Int = 20){

}

fun main() {
    val stu = InitOrderDemo("thanh")
}