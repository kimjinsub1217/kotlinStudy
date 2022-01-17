package com.example.kotlinstudy.Kotlin

/*
break : 반복문을 바로 탈출하는 키워드
 */

fun main(args: Array<String>): Unit {
    var i: Byte = 0

    while (true) {
        i++
        if (i >= 5)
            break
        println(i)

    }
}