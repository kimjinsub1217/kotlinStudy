package com.example.kotlinstudy.Kotlin.nullable_receiver

import com.example.kotlinstudy.Kotlin.extension_function.isNumber


fun String?.isNumber(){
    if(this == null){
       println("문자열이 null입니다.")
    }
}



fun main(args: Array<String>) {
    val empty: String? = null
    empty.isNumber()
}