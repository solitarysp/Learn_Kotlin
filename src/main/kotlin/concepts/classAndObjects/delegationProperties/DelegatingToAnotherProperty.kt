package concepts.classAndObjects.delegationProperties

class Student(val name: String) {
    val name2: String by this::name;

}

fun main() {
    val s = Student("Thành");
    println(s.name2)
    println(s.name)
}