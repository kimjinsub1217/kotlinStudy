package com.example.kotlinstudy.Kotlin.indexd_access_operator

class Person(var name : String,var birthday:String) {
    operator fun get(position:Int):String{
        return when(position){
            0 -> name
            1 -> birthday
            else -> "알수 없음"
        }
    }

    operator fun set(position: Int,value:String){
        when(position){
            0 -> name = value
            1 -> birthday = value
        }
    }
}