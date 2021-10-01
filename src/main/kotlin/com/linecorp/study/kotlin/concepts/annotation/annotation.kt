package com.linecorp.study.kotlin.concepts.annotation

@Target(
    AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class NameClass(val value: String) {

}

@NameClass("Thành1")
class DemoNameClassImpl {

}

fun main() {
    val demoNameClassImpl = DemoNameClassImpl();
    println(demoNameClassImpl.javaClass.getAnnotation(NameClass::class.java)?.value)
}
