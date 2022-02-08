package com.example.kotlinstudy.Kotlin

// 함수 밖에서 선언한 변수는 함수 호출이 끝나도 사라지지 않는다. <-- 전역변수
// 블록( {} )안에서 선언한 변수는 블록 밖으로 나가면 사라진다.  < -- 지역변수
// 스코프가 다르면 변수의 이름이 중복될 수 있다.즉, 지역변수와 전역변수의 이름이 중복될 수 있다.
// 서로 다른 함수 안에 같은 이름의 변수가 존재 할 수 있다.


var count = 0  // 전역변수

fun main(args: Array<String>) {
    val a = 15 // 지역변수
    println(a) // a = 15

    count += 1 // 전역 변수 0 에서 1 더해서 1
    printCount()
    println(count)

    fun printFormula(a: Int, b: Int) { // 지역함수 : 함수 안에서만 쓰이는 함수
        println(a * b + a - b)
    }

    printFormula(73,1)
    printFormula(4,6)
}

fun printCount() {
    println(count) // 1
    count += 1 // 전역변수 1 + 1 = 2
}