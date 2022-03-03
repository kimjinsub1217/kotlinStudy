package com.example.kotlinstudy.Kotlin.indexd_access_operator

fun main(args:Array<String>){
    val person = Person("pikachu","2022-01-01")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "raichu"
    println(person.name)
}