package basices.Idioms

fun main() {
    defaultValue();
    defaultValue(name = "d");
    var list = listOf("a", "b", "c")
    println("Test".lethanh())
    val value = "test"

    val student = StudentIdioms();
    with(student) {
        test1("test");
        test2("test2");
    }

}

fun String.lethanh(): String {
    return this + "-lethanh";
}

fun defaultValue(name: String = "Default name") {
    println(name);
}