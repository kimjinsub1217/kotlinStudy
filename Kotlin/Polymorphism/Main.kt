package com.example.kotlinstudy.Kotlin.Polymorphism

open class AAA {
    open fun hello() = println("AAA 입니다.")
}

class BBB : AAA() {
    override fun hello() = println("BBB 입니다.")
}


fun main(args: Array<String>) {
    val one = AAA()
    val two = BBB()
    val three:AAA =two


    one.hello()
    two.hello()
    three.hello()
}