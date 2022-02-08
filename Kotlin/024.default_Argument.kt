package com.example.kotlinstudy.Kotlin

//defaultArgument: 기본값이 미리 정의되어 있는 인수
//매개변수가 너무 많아 호출하기 번거울 때 사용하면 좋다.
//매개변수의 이름을 지정한 인수는 일반 인수들보다 항상 오른쪽에 있어야 한다.

fun main(args: Array<String>) {
    println(getAverage(89, 96)) //평균
    getAverage(100, 50, true) //인수1, 인수2, true를 넘기면 출력이 된다.
    println(getAverage(90))// 90 + 디폴트 값 num2 = 0 = 90 / 2 = 45.0
    getAverage(66,print =true) // 66 + 디폴트 값 num2 =0 = 66 / 2 = 33.0
    getAverage(print=true) // num1 = 0 + num2 = 0
    getAverage(print=true, num1 = 70, num2 = 70) //num1 = 70 + num2 = 70 = 140 / 2 = 70
}

fun getAverage(num1: Int = 0, num2: Int = 0, print: Boolean = false): Double {
    val result = (num1 + num2) / 2.0
    if(print)// print true면 아래 출력문 출력
        println(result)
    return result
}
