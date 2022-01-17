package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>): Unit {
    println(myFunction())
    println(myFunction()+100)
}

fun myFunction(): Int {
    val a = 3
    val b = 6
    println("a:" + a + ",b" + b)
    return a + b
}