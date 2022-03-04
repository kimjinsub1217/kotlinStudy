package com.example.kotlinstudy.Kotlin.ex_array_to_vararg


fun printAll(vararg tokens: String) {
    for (tokens in tokens)
        print("$tokens ")
}

fun main(args: Array<String>) {
    val numbers: Array<String> = arrayOf("What`s","your","name?")
    printAll(*numbers)
}
