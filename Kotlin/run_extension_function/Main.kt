package com.example.kotlinstudy.Kotlin.run_extension_function

fun main(args: Array<String>) {
    val a = 10
    val b = 5

    (a * b - 2 * 2).run {
        if (this > 0)
            println(this)
    }
}