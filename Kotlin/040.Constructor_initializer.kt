package com.example.kotlinstudy.Kotlin

//객체를 생성과 동시에 원하는 값으로 초기화하는 방법

class Person constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main(args:Array<String>){
    val person=Person("홍길동",29)
    println("이름 : ${person.name}")
    println("나이 : ${person.age}")
}