package com.example.kotlinstudy.Kotlin

/*
    when : if와 같이 조건에 따라 문장 실행 여부를 결정하는 키워드 자바의 switch-case같은 개념
 */

fun main(args: Array<String>): Unit {
    val score: Int = 88

    val grade: Char = when (score / 10) {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }
    println(" $grade 학점입니다.")
}