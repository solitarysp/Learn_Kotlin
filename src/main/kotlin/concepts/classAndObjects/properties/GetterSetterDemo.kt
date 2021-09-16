package concepts.classAndObjects.properties

class GetterSetterDemo1(name: String) {
    var fullName: String? = null
        get() = field + "-demo"
        set(name) {
            println("Setter name")
            field = name
        }

    companion object {
        const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
    }
}

fun main() {
    val t1 = GetterSetterDemo1("Thành")
    println(t1.fullName)
    println(GetterSetterDemo1.SUBSYSTEM_DEPRECATED)
}