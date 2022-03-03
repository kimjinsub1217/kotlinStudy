package com.example.kotlinstudy.Kotlin.extension_property


val String.isLarge: Boolean
    get() = this.length >= 10


fun main(args: Array<String>) {
    println("1234567890".isLarge)
    println("300원".isLarge)
}