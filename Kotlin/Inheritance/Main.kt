package com.example.kotlinstudy.Kotlin.Inheritance

open class Person(val name:String,val age:Int)

class Student(name:String,age:Int,val id:Int):Person(name,age)

fun main(args:Array<String>){
    val person = Person("피카츄",2)
    val student = Student("라이츄",3,20220101)
}