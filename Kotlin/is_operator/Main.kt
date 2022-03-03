package com.example.kotlinstudy.Kotlin.is_operator

import com.example.kotlinstudy.Kotlin.Inheritance.Person
import com.example.kotlinstudy.Kotlin.Inheritance.Student

class Professor(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {

    val person: Person = Student("Mark", 33,2)
    print("${person is Person} ")
    print("${person is Student} ")
    print("${person is Professor} ")

    val person2: Person = Professor("John", 32)
    print("${person2 is Person} ")
    print("${person2 is Student} ")
    print("${person2 is Professor} ")
}