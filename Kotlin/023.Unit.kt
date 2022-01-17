package com.example.kotlinstudy.Kotlin

/*
    Unit : 반환 값이 필요 없을 떄 사용 그렇기 떄문에 함수 끝에 return을 안 적어도 딤
 */
fun main(args:Array<String>){
    celsuisToFah(27)
}

fun celsuisToFah(celsuis:Int):Unit{
    println(celsuis*1.8+32)
}
