package com.example.kotlinstudy.Kotlin

//init : 초기화 블록(initialize Block)의 줄임말
//init 블록 나누어 쓰는법

class Size(width: Int, height: Int) {
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args:Array<String>){
    val size=Size(10,50)
    println(size.area)
}