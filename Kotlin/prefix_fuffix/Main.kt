package com.example.kotlinstudy.Kotlin.prefix_fuffix

fun main(args:Array<String>){
    val str:CharSequence = "www.naver.com"

    println(str.startsWith("www."))
    println(str.endsWith(".com"))

    println(str.removePrefix("www."))
    println(str.removeSuffix(".com"))
    println(str.removeSurrounding("www.",".com"))

}