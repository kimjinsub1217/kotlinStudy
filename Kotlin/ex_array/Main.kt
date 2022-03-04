package com.example.kotlinstudy.Kotlin.ex_array


// size : 프로퍼티는 배열의 원소 개수를 나타낸다.
// get/set : 연산자 멤버 함수는 배열을 [] 연산자로 접근할 수 있게 해준다.
// iterator : 연산자 멤버 함수는 배열을 for문에 쓸 수 있게 해준다.


fun main(args: Array<String>) {
    val integers: Array<Int> = arrayOf(10, 20, 30, 40)

    println(integers.size)
    println(integers[1])

    for(i in integers)
        println("$i")
}