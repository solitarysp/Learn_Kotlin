package com.linecorp.study.kotlin.concepts.classAndObjects.`class`

open class OverridingDemo() {
   open fun run() {

    }
}

open class OverridingDemoImpl() : OverridingDemo() {
   final override fun run() {

    }
}
class OverridingDemoImpl2() : OverridingDemoImpl() {
//    override fun run() {
//
//    }
}

fun main() {

}