package com.example.kotlinstudy.Kotlin.ex_enum_class_members

//열거 클래스도 클래스의 일종이기 때문에 프로퍼티와 멤버 함수를 가질 수 있다.

enum class Mode(val number:Int){
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3);

    fun printNumber(){
        println("모드: $number")
    }
}


fun main(args:Array<String>){
    //현재 선택된 모드

    val mode:Mode = Mode.PEN

    println(mode.number)
    mode.printNumber()
}