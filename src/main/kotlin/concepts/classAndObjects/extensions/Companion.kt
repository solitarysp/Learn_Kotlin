package concepts.classAndObjects.extensions

class MyClass {
    companion object {}  // will be called "Companion"
}

fun MyClass.Companion.printCompanion() {
    println("companion")
}

val MyClass.Companion.Name: String
    get() = "THành"

fun main() {
    MyClass.printCompanion()
    println(MyClass.Name)
}

