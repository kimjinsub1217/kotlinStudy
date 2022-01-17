package com.example.kotlinstudy.Kotlin

/*
    typealias : 타입에 별명을 붙인다.
 */

typealias Number = String

fun main(args: Array<String>):Unit{
    val apple:Number = "사과"
    println(apple)
}