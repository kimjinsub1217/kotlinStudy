package com.example.kotlinstudy.Kotlin

// === 연산자 : 두 참조 변수가 같은 객체를 가리키고 있는지 여부를 조사하는 연산자이다.
// !== 연산자 : ===와 반대로 두 참조 변수가 서로 다른 객체를 가리키고 있으면 true

fun main(args: Array<String>) {
    var a = "one"
    var b = "one"
    println(a === b)
    println()

    //b에 "on" 문자열을 저장하고 "e" 문자열을 누적하고 있다.
    //표현식이 리터럴로만 이루어져 있지않으면 b가 a와 똑같은 문자열을
    // 저장하고 있다고 해도 새로운 문자열이 만들어 진다.
    b = "on"
    b += "e"
    println(b)
    println(a !== b)
    println()

    b = a
    println(a === b)
}