package com.example.kotlinstudy.Kotlin

/*
 continue : 반복문의 일부 문장을 무시하고 건너뜀
 */
fun main(args: Array<String>): Unit {
    var i = 0
    while(i<10){
        i++
        if(i % 2 == 0)//만약에 짝수이면
            continue
        print("$i ")
    }
}