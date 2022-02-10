package com.example.kotlinstudy.Kotlin

// 멤버 함수의 매개변수와 프로퍼티의 이름을 중복될 수 있다.

class AAA {
    var num = 15 // AAA 클래스 안에 num이라는 프로퍼티가 들어있다.

    fun mamberFunc(num: Int) { //프로퍼티와 멤버 함수의 매개변수 이름이 중복해도 오류가 나지 않는다.
        println(num) // 변수 이름을 그냥 적으면 이 변수는 매개 변수로 인식한다.
        println(this.num) // this가 붙어 있으면 프로퍼티로 인식된다.
    }
}

fun main(args: Array<String>) {
    val a = AAA()
    a.mamberFunc(53)
}