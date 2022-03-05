package com.example.kotlinstudy.Kotlin.char_sequence_split

fun main(args:Array<String>){
    val hello:CharSequence ="안녕\n고맙다\n반갑다"
    val time:CharSequence = "2022-01-01"

    println(hello.lines())
    for(line in hello.lineSequence())
        println(line)
    print(time.split('-'))
}