package concepts.classAndObjects.delegationProperties

import kotlin.reflect.KProperty


class Student2 {
    val name: String by ResourceDelegateName()
    var age: Int by ResourceDelegateAge()
}

class ResourceDelegateName {
    operator fun getValue(thisRef: Student2, property: KProperty<*>): String {
        return "$thisRef Thành $property"
    }
}

class ResourceDelegateAge {
    var curValue = 0
    operator fun getValue(thisRef: Student2, property: KProperty<*>): Int {
        println("$thisRef Thành $property")
        return curValue
    }

    operator fun setValue(thisRef: Student2, property: KProperty<*>, value: Int) {
        curValue = value;
    }
}

fun main() {
    val a = Student2();
    println(a.name)
    a.age = 21;
    println(a.age)
    a.age = 25;
    println(a.age)
}
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    return Unit;
}