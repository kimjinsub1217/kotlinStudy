package com.example.kotlinstudy.Kotlin

/*
    $: $ 뒤에 변수를 적어주면 해당 값이 온다.
    $를 출력하고 싶으면 \$식으로 앞에 \를 붙이면 된다.
 */

fun main(args: Array<String>): Unit {
    val name: String = "KimJinSub"
    val ghanaChocolate: Int = 1000
    val cocacola: Int = 2150


    println("My name is $name")
    println("가나초콜릿과 코카콜라 합해서 \$${ghanaChocolate + cocacola} 입니다.")
}