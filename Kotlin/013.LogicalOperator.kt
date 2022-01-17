package com.example.kotlinstudy.Kotlin

/*
    논리연산자 : 참과 거짓으로 계산을 수행하는 연산자

    && : a와 b가 모두 true면 true 하나라면 false면 false
    || : a와 b가 하나라도 true면 true 둘다 false면 false
    ! : a가 true면 false a가 false면 true
 */

fun main(args: Array<String>): Unit {
    val a = 15
    val b = 17

    var bool: Boolean = (a - b < a + b)&&(a==15)//-2 < 32 && 15 ==15    1 1
    println(bool)

    bool=!((a+b)>(a*3)||(b-a)>0) //32 > 45 || 2 > 0   0 1 -> true -> false
    println(bool)
}
