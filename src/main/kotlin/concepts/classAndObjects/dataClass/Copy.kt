package concepts.classAndObjects.dataClass

data class CopyDemo(val name: String, val age: Int) {
    fun test() {

    }
}

fun main() {

    val d = CopyDemo("Thành", 20)
    val d1 = d.copy(age = 25);
    println(d)
    println(d1)
}