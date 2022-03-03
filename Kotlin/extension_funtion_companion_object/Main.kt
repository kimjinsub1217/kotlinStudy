package com.example.kotlinstudy.Kotlin.extension_funtion_companion_object

class Person {
    companion object
}

fun Person.Companion.create()=Person()

fun main(args:Array<String>) = Person.create()