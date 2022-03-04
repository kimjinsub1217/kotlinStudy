package com.example.kotlinstudy.Kotlin.it_odemtofor

fun main(args:Array<String>) {
    val instantFunc:(Int)->Unit={
        println("Hello $it")
    }

    instantFunc(37)


}