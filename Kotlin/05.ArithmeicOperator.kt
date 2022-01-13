package com.example.kotlinstudy.Kotlin

/*
코틀린의 산술연산자는 다른 언어와 똑같이 +,-,*,/,%가 있다.
.toDouble() : 해당 표현식의 타입이 Double타입으로 됨
.toInt() : 해당 표현식의 타입이 Int타입으로 됨

num4:Double = num1.toDouble()/num2+11.1 : toDouble()붙이는 이유
num1 =9 num2 =2 Int타입끼리 산술 연산이 되어 Int타입 결과값이 나와 9/2가 4.5가 아니라 4가 나왔다
이걸 해소시켜주기 위해 toDouble()로 Double타입으로 변환하여 연산하도록 하였다.
 */

fun main(args:Array<String>):Unit{
    val num1:Int = 1+2+2*3
    val num2:Int = 83%9
    val num3:Double = 12/2+1.11
    val num4:Double = num1.toDouble()/num2+11.1//9/2+11.1 -> 4.5+11.1 -> 15.6

    println(num1)
    println(num2)
    println(num3)
    println(num4)
    println(num4.toInt())
}