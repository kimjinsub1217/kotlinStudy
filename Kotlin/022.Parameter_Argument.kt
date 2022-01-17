package com.example.kotlinstudy.Kotlin

fun main(args:Array<String>):Unit{
    println(cTof(30))
    println(getAverage(96,89))
}

fun cTof(celsius:Int):Double{
    return celsius*1.8+32
}

fun getAverage(a:Int,b:Int):Double{
    return (a+b)/2.0
}