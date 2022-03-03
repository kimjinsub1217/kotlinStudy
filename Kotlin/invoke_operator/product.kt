package com.example.kotlinstudy.Kotlin.invoke_operator

class Product(val id: Int, val name: String){
    operator fun invoke(value:Int){
        println(value)
        println("id:$id\n name::$name")
    }
}