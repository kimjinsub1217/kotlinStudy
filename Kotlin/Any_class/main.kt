package com.example.kotlinstudy.Kotlin.Any_class

fun main(args:Array<String>){
    val building =Building("피카츄", area = 230)
    printObject(building)
}


fun printObject(any: Any){
    println(any.toString())
}