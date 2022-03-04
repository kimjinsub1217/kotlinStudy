package com.example.kotlinstudy.Kotlin.pair

fun divide(a: Int, b: Int): Pair<Int, Int> = Pair(a/b,a%b)

fun main(args:Array<String>){
    val(q,r) = divide(10,3)
    println("목:$q")
    println("나머지:$r")
}