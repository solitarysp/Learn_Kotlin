package basices.syntax

fun main(args: Array<String>) {
    // Sử val khi mong muốn các biến không thể được reassigned
    variablesVal()
    variablesValError()

    // Sử dụng var khi chúng ta mong muốn có thể reassigned
    variablesVar();
}

fun variablesVar() {
    var b = 2;
    b = 1;
    println("variablesVar: $b");

}

fun variablesVal() {
    val a: Int = 1;
    val b = 2;
    val c: Int;
    c = 3;
    println("variablesVal: $c");
}

fun variablesValError() {
    val a: Int = 1;
    val b = 2;
    //b = 1;
}
