package com.example.kotlinstudy.Kotlin

// 스택 : 메모리에는 스택이라는 영역기 있다. 이곳에 지역 변수가 저장되고 스택은 쌓아올리는 뜻으로 변수가
//       변수가 생성될 때 생성된 순서대로 차곡차곡 쌓인다. 후입선출 구조를 가진다.

fun main(args: Array<String>) {// 1. main 함수가 시작되고 매개변수 args가 생성된다.
    var a = -16 // 2. 지역변수 a가 선억되고 a가 스택 영역에 쌓인다.
    val result = absolute(a) // 5. result가 선언되고 result가 스택 영역에 쌓인다.
    println(result) // result 출력
    // main이 끝나면서 모든 지역 변수가 스택 영역에서 사라짐짐}
}

fun absolute(number: Int): Int { // 3. 매개변수 number가 생성되고 number가 스택영역에 쌓인다.
    return if (number >= 0)      // 4. 함수가 끝나면 number가 스택 영역에서 사라진다.
        number
    else -number
}