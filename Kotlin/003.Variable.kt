package com.example.kotlinstudy.Kotlin

/*
    Variable : 값을 저장하는 곳
    var : 변수 키워드이며 값을 저장하고 나중에 수정 가능 하다
    val : 변수 키워드이며 한번 값을 저장하면 나중에 못 바꿈
    hap,num1,num2 : 변수 이름이고 식별자라고 한다.
 */

fun main(args: Array<String>): Unit {
    var hap: Int = 0

    val num1: Int = 1 + 2 + 3 + 4 + 5
    println(num1)

    val num2: Int = num1 + 10 + 20 + 30
    println(num2)

    hap = num1 + num2
    println(hap)
}