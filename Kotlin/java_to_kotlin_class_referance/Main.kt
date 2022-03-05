package com.example.kotlinstudy.Kotlin.java_to_kotlin_class_referance

fun main(args: Array<String>) {
    val number: Int = 22
    val str:String = "2022년"

    JavaClass.printClassInfo(number::class.java)
    JavaClass.printClassInfo(str::class.java)
    JavaClass.printClassInfo(Double::class.java)
}