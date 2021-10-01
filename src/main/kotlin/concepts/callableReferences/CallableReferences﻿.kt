package concepts.callableReferences


fun isOdd(x: Int) = x % 2 != 0
var x = 1;


fun main() {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

    ::x.set(20);

    println(x)

}