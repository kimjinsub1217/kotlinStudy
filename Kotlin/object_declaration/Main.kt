package com.example.kotlinstudy.Kotlin.object_declaration

object Person {
    var name: String = ""
    var age: Int=0

    fun printf(){
        println(name)
        println(age)
    }

}


fun main(args: Array<String>) {
    Person.name ="꼬부기"
    Person.age = 7
    Person.printf()
}