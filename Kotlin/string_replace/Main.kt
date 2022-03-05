package com.example.kotlinstudy.Kotlin.string_replace

fun main(args:Array<String>){
    val Love = "Love begets love."

    println(Love.replace("love","hate",ignoreCase = true))
    println(Love.replaceFirst("love","compliment",ignoreCase = true))
    println(Love.replaceRange(5..10, "hello"))
}