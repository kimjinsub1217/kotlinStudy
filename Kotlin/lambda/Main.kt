package com.example.kotlinstudy.Kotlin.lambda

fun main(args:Array<String>){
    val instantFunc:(Int) ->Unit

    instantFunc = {number:Int ->
        println("hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}