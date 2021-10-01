import com.linecorp.study.kotlin.basices.syntax.SupperStudent

class Student(
    val name: String,
    val age: Int,
) : SupperStudent() {
    var address: String = "Ha Noi"
        get() = field
        set(addressData) {
            println("Setter address")

            field = addressData
        }

    fun test() {
        println(this.name)
    }

    init {
        println("Init block")
    }


}