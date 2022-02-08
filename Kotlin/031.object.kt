package com.example.kotlinstudy.Kotlin

//object: 객체란 우리가 인식할 수 있는 물체 또는 물건을 뜻하고,객체들은 각자의 고유한
//        속성과 동작을 갖고 있다

fun main(args: Array<String>) {
    val car = object {
        val name: String = "huracan"
        val color: String = "black"
    }

    println("차 종류: ${car.name}")
    println("차 색상: ${car.color}")
}
