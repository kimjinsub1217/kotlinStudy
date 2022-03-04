package com.example.kotlinstudy.Kotlin.data_class

data class Employee(
    val name:String,
    val age: Int,
    val salary:Int
)

fun main(args: Array<String>){
    val first = Employee("John",30,3000)
    val second = Employee("page",24,3300)
    val third =first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first ==third)

}