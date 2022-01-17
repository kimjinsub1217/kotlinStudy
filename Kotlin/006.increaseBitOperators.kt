package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>): Unit {
    //증감연산자
    println("*증감연산자*")
    var num1: Int = 1
    var num2: Int = 10

    num1++ //증가연산:1증가
    println(num1)
    num1-- //감소연산:1감소
    println(num1)
    println(num1-- + num2) //num1--:후위 감소 계산이 끝난 후 감소함
    println(num1)
    println(num2)
    println(--num2 - 2) //--num2:전위 감소 계산이 끝나기 전에 감소 한후 연산이 이루어진 다.
    println()

    //비트연산자
    println("*비트연산자*")
    println(10 and 6) // and연산  1010 & 0110 = 0010 = 2
    println(10 or 6) // or연산  1010 | 0110 = 1110 = 14
    println(10 xor 6) // xor연산  1010 ^ 0110 = 1100 = 12
    println(1234569.inv()) //비트단위로 반전 ~1234569 = 1234570
    println(1 shl 2) // 1<<2: 1을 왼쪽으로 2칸 시프트 0001 -> 0100 = 4
    println(5 shr 2) // 5>>2: 5을 오른쪽으로 2칸 시프트 0101 -> 0001 = 1
    println(-5 ushr 2) // 부호를 유지한 채 오른쪽으로 2칸 시프트
    /*
           -5 = 0101 -> 1010 -> 1011
           1111 1111 1111 1111 1111 1111 1111 1011 -> 2칸 이동
           0011 1111 1111 1111 1111 1111 1111 1110 -> 10진수로 변환

     */

}