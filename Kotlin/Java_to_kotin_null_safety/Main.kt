package com.example.kotlinstudy.Kotlin.Java_to_kotin_null_safety

class KotlinClass : JavaInterface {
    var num: Int = 0

    override fun trim(str: String?): String =
        str?.trim() ?: ""
}

fun main(args: Array<String>) {
    val javaInterface:JavaInterface=KotlinClass()
    println(javaInterface.trim(" hi "))
}