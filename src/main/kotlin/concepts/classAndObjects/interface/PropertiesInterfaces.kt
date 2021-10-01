package concepts.classAndObjects.`interface`


interface PropertiesInterfacesA {
    var name: String;
}

class PropertiesInterfacesAImpl(override var name: String) : PropertiesInterfacesA

fun main() {
val test=PropertiesInterfacesAImpl("Thành");
}