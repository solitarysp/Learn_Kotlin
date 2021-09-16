package basices.syntax

fun main() {
    check(1);
    check("1");
    check("hai");
    check(1L);
}

fun check(data: Any) =
    when (data) {
        1 -> "one"
        in 2..9 -> "in 2 to 9"
        "hai" -> "two"
        is Long -> "Is Long"
        !is String -> "Is not String"
        else -> " chịu"
    }