package concepts.classAndObjects.delegation.overriding

interface Action {
    fun run();
}

open class Student : Action {
    override fun run() {
        println("Student run")
    }

}

class StudentVip(s: Action) : Action by s {
    override fun run() {
        println("StudentVip run")
    }
}

fun main() {
    val s = StudentVip(Student());
    s.run();
}