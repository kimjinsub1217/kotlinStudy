package com.example.kotlinstudy.Kotlin

//개수가 정해지지 않는 매개변수를 만들고 싶을때 사용

fun main(args: Array<String>) {
    println(getSumOf(1, 2, 3, 4, 5))
    println(getSumOf(10, 10, 10))
    println(getSumOf())
}

fun getSumOf(vararg numbers: Int): Int {
    val count = numbers.size //numbers의 개수를 저장한다.
    var i = 0
    var sum = 0

    while (i < count) {
        sum += numbers[i]
        i += 1
    }
    return sum
}