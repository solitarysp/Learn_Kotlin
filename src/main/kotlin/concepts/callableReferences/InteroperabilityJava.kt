package concepts.callableReferences

import kotlin.reflect.jvm.javaGetter

class RefrenDemo(val p: Int) {

}

fun main() {
    RefrenDemo::p.javaGetter

    // truyền constructor
    function(::RefrenDemo, 1)



    val numberRegex = "\\d+".toRegex()
    println(numberRegex.matches("29"))

    val isNumber = numberRegex::matches
    println(isNumber("29"))

}

fun function(factory: (p: Int) -> RefrenDemo, param: Int) {
    val x: RefrenDemo = factory(param)

    println(x.p)
}