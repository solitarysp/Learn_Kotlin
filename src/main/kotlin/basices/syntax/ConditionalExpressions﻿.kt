package basices.syntax

fun main() {
println(maxOf(1,2))
println(maxOf2(1,2))
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}