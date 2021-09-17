package concepts.classAndObjects.dataClass

open class DataClassCha() {
    override fun equals(other: Any?): Boolean {
        println("hashCode class cha")
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

}

data class DataClassCon(val name: String) : DataClassCha() {
    override fun hashCode(): Int {
        println("hashCode class con")
        return name.hashCode()
    }
}



fun main() {
    val d1 = DataClassCon("Thành")
    val d2 = DataClassCon("Tuấn")
    println(d1.equals(d2))
    println(d1.hashCode())
}