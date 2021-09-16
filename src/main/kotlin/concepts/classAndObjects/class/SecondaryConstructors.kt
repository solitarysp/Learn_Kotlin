package concepts.classAndObjects.`class`


class Student3 {
    constructor(name: String, age: Int) {

    }

    constructor(name: String) {

    }
}

class Student4(val name: String) {
    var age: Int? = null;

    constructor(name: String, age: Int) : this(name) {
        this.age = age;
    }
}

class OrderConstructorAndInitializerBlocks(val name: String = "") {
    init {
        println("Init block $name")
    }


    constructor(name: String, age: Int) : this(name) {
        println("Secondary  constructor")
    }

    init {
        println("Init block2 $name")
    }
}

fun main() {
    // demoSecondary()
    // demoSecondaryWithPrimaryConstructor()
    val s = OrderConstructorAndInitializerBlocks("d", 20);
}

private fun demoSecondaryWithPrimaryConstructor() {
    val s = Student4("Thành");
    val s1 = Student4("Thành", 23);
    println("s: name= ${s.name} and age ${s.age}")
    println("s1: name= ${s1.name} and age ${s1.age}")
}

private fun demoSecondary() {
    val s1 = Student3("thanh");
    val s2 = Student3("thanh", 10);
}