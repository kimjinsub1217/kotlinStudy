package com.example.kotlinstudy.Kotlin.apply_extension_function

class Person {
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString() = "$name $age $money"
}


fun main(args: Array<String>) {
    println(
        Person().apply {
            this.name = "지우"
            this.age = 22
        }
    )
}