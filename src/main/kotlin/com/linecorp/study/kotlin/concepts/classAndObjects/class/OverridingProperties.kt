package com.linecorp.study.kotlin.concepts.classAndObjects.`class`


open class OverridingProperties() {
    open val age = 0;
}

open class OverridingPropertiesImpl() : OverridingProperties() {
    override var age = 0;
}

fun main() {

}