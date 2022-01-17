package com.example.kotlinstudy.Kotlin

/*
    비교 연산자 : 두 피연산자를 비교하는 연산자 결과 타입은 Boolean형태이며 true,false값만 저장한다.

    == : a와 b가 같으면 true 다르면 false
    != : a와 b가 다르면 true 같으면 false
    a > b : a가 b보다 크면 true 그렇지 않으면 false
    a < b : a가 b보다 크면 false 그렇지 않으면 true
    a >= b : a가 b보다 크거나 같으면 true 그렇지 않으면 false
    a <= b : a가 b보다 작거나 같으면 true 그렇지 않으면 false
 */

fun main(args: Array<String>): Unit {
    var isRight: Boolean = (10 + 70) > (20 + 30)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.0002f
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)

}