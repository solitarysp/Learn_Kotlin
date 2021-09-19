package concepts.classAndObjects.generics

import concepts.classAndObjects.generics.Source as Source1

open class StringNew {

}

class StringNew2 : StringNew() {

}


class Source<in T> {
    fun add(t:T) {

    }
}

fun demo(strs: Source1<StringNew>) {
    val objects: Source1<StringNew> = strs
    // ...
}

fun main() {
    val a = Source1<StringNew>()
    demo(a)
    a.add(StringNew2())
}