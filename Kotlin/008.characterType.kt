package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>): Unit {
    val ch: Char = 'a'
    println(ch)

    val ch2 = '\uAC00' // 유니코드
    println(ch2)

    val ch3: Char = '한'
    println(ch3.code)// 유니코드 숫자로 변환 함수
}


