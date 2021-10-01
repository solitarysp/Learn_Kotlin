package com.linecorp.study.kotlin.concepts.classAndObjects.delegationProperties.standard

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("") {
            prop, old, new ->
        println("$prop = $old -> $new")
    }
    var name2: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        if (newValue !== oldValue) true
        else
            // nếu trả về false sẽ không gán và không có phản ứng gì cả.

            throw IllegalArgumentException("The same old")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"

    user.name2 = "second"
    user.name2 = "second"
}