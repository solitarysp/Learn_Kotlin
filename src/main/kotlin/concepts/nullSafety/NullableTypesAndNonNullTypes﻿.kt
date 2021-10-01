package concepts.nullSafety

class StudentNullTest {
    fun test() {
        println("Test")
    }

    fun test2(a: Any) {
        val data = a as? Int;
    }

    var name: String? = null;
}

fun main() {
    var s: StudentNullTest? = StudentNullTest();
    s = null;
    s?.test();

    val l = s?.name ?: -1

    s!!;
}