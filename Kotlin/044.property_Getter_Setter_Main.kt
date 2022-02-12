package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>) {
    val person = Person2()

    person.age = -30 // person 객체의 age 프로퍼티에 값을 저장한다.
                     // 프로퍼티에 특정 값을 대입하면 이 프로퍼티에 해당하는 setter가 호출된다.

    println(person.age) //person 객체의 age 프로퍼티에 저장된 값을 읽어온다.
                        //특정값을 읽어오려 하면  getter가 호출된다.
}