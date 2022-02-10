package com.example.kotlinstudy.Kotlin

//프로퍼티 선언과 생성자 정의를 한번에 하는 방법

class Car(val name: String, val speed:Int =0)

fun main(args:Array<String>){
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}