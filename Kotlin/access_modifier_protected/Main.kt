package com.example.kotlinstudy.Kotlin.access_modifier_protected

// protected : 접근 지정자는 클래스 내부에서 사용된다.

open class AAA(protected val number: Int)

class BBB(number:Int):AAA(number){
    fun printNumber(){
        println(number)
    }
}

fun main(args: Array<String>){
    val test = BBB(6)
//    prinln(test.number)
    test.printNumber()
}