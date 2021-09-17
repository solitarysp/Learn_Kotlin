package concepts.classAndObjects.extensions

class A {

}

class B(val a: A) {
    fun A.test() {
        println("Khai bao method a trong b")
    }

    fun test() {
        a.test();
    }
}

fun main() {
    val b = B(A());
    b.test();
}