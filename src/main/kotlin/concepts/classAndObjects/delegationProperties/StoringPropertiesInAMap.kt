package concepts.classAndObjects.delegationProperties

import concepts.classAndObjects.extensions.B

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main() {
    val a = User(mapOf("name" to "Thành", "age" to 25));
    println(a.age)
    println(a.name)
}

