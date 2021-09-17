package concepts.classAndObjects.extensions

fun String.leThanh(): String {
    return this + "-LeThanh";
}

class Student(val name: String) {

}

fun Student.showNameVip(): String {
    return this.name + "-Vip"
}

class Example {
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }


fun main() {
    val name = "HaNoi"
    println(name.leThanh())
    println(Student("Thành").showNameVip())

    Example().printFunctionType()
}

