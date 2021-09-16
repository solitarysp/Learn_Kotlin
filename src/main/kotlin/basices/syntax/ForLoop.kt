package basices.syntax

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println("Chạy từ 3 đến 1")
    for (item: Int in 3 downTo 1 step 1) {
        println(item)
    }
    println("Chạy từ 1 đến 3")

    for (item: Int in 1..3 step 1) {
        println(item)
    }


}