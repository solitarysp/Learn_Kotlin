package basices.conventions

fun main() {
    println(demo(5,2))
    println(demo(b=2,a=6));
    println("""
    Trimmed
    text
    """.trimIndent()
    )

    val a = """Trimmed to margin text:
          |if(a > 1) {
          |    return a
          |}""".trimMargin()

    println(a)
}

fun demo(a: Int, b: Int): Int {
    return a - b;
}