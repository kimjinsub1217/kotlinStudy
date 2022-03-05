package com.example.kotlinstudy.Kotlin.also_extension_function

import com.example.kotlinstudy.Kotlin.apply_extension_function.Person

class Person {
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString() = "$name $age $money"
}


fun main(args: Array<String>) {
    println(
        Person().also { person: Person ->
            person.name = "지우"
            person.money = 33000
        }
    )
}