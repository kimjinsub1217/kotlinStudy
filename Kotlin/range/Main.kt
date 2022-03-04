package com.example.kotlinstudy.Kotlin.range

fun main(args:Array<String>){
    val oneToTen: IntRange = 1..10
    println(5 in oneToTen)

    val upperAtoZ:CharRange='A'..'Z'
    if('C' in upperAtoZ)
        println("대문자 입니다.")

    if ('p' in 'a'..'z')
        println("소문자입니다.")
}