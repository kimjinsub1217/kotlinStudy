package com.example.kotlinstudy.Kotlin.generic

fun <T> toFunction(value: T): () -> T = { value }

fun main(args: Array<String>) {
    val func: () -> Int = toFunction<Int>(2222)
    println(func)
}