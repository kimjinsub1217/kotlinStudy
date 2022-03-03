package com.example.kotlinstudy.Kotlin.access_modifier_private

fun main(args:Array<String>){
//    num=5  접근 불가
    hello(15)

    val person = Person(10)
    println(person.age)
//    person.age =20

    println(person.isYoung)

}