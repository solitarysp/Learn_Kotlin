package com.linecorp.study.kotlin.concepts.classAndObjects.delegationProperties.standard

class ClassEntity(val name: String) {

}

val nameSystem: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    println("Start load lazy");
    "Test Lazy properties\uFEFF"
}


val classEntity: ClassEntity by lazy {
    println("Start load lazy ClassEntity");
    ClassEntity("Lazy load ClassEntity")
}


fun main() {
    println("Test start")
    println(nameSystem);
    println(nameSystem);
    println("=====")

    println(classEntity.name);
    println(classEntity.name);



}