package com.example.kotlinstudy.Kotlin.exit_process_function

import com.example.kotlinstudy.Kotlin.throw_exception.something
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    something(-1)
    println("Hellow")
}

fun something(num: Int) {
    if (num < 0)
        exitProcess(0)
}