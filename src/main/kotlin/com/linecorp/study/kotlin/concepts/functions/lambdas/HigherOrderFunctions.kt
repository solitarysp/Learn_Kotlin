package com.linecorp.study.kotlin.concepts.functions.lambdas

class IntTransformer : (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}

val intFunction: (Int) -> Int = IntTransformer()
val a = { i: Int -> i + 1 }
val stringPlus: (String, String) -> String = String::plus

fun test(number: Int, funcLamba: (Int) -> Boolean): Boolean {

    return funcLamba(number);
}

fun main() {
    println(stringPlus.invoke("<-", "->"))
    println(a.invoke(2));

    println(
        test(5, funcLamba = { i: Int ->
            i > 3
        })
    )


}
