package com.example.kotlinstudy.Kotlin.ex_null

import com.example.kotlinstudy.Kotlin.object_extends_class.Person

fun main(args: Array<String>) {
    var person: Person? = Person("K", 22)
    person = null

    var num: Int? = null
    num = 10
}