package com.example.kotlinstudy.Kotlin.lterable

//first : 시작값
//last : 끝값
//step : 증가 값
fun main(args:Array<String>){
    val prog : IntProgression = 3..7
    println(prog.first)
    println(prog.last)
    println(prog.step)

    for(i in prog)
        println("$i")

}