package com.example.kotlinstudy.Kotlin.anonymous_function

fun main(args:Array<String>){
    val instantFunc:(Int) -> Unit = fun(number:Int):Unit{
        println("hello $number")
    }

    instantFunc(33)
    instantFunc(22)
}