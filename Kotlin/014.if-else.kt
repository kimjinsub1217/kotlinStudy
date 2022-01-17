package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>): Unit {
    var a = 15
    var b = 20
    val score =77

    if (a > b){
        println("a가 더 크다!")
    }else{
        println("b가 더 크다!")
    }

    if(score>=90){
        println('A')
    }else if(score>=80){
        println('B')
    }else if(score>=70){
        println('C')
    }else if(score>=60){
        println('D')
    }else{
        println('F')
    }

}