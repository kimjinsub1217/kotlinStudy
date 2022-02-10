package com.example.kotlinstudy.Kotlin

//스택이 아닌 힙 영역세 실제 공간이 할당되는 타입을 참조 타입이라고 한다.
//코틀린에서 Byte,Short,Int,Float,Double,Char,Boolean 타입을 제외한 타입은 모두 참조타입
//문자열은 힙 영역 생성되며,String 변수는 문자열의 참조값을 저장하기 위한 공간만 갖고있다.

fun main(args: Array<String>) {
    var firstName = "노하라" //스택 영역 firstName에 힙 영역에 "노하라"가 생성됨
    var lastName = "신노스케" //스택 영역 lastName에 힙 영역에 "신노스케"가 생성됨
    firstName += lastName // 스택 영역 firstName에 힙 영역에 "노하라 신노스케"가 생성됨

    // 여기서 문제점이 firstName ="노하라" 가 firstName이 힙 영역에서 "노하라 신노스케" 되며
    // "노하라"는 힙 영역에서 사라지지 않는다,또한 연결된 참조 변수가 하나도 없기 떄문에 다시 접근할 방법도 없다.
    // + 연산을 할때마다 힙에 문자열이 계속 쌓여 나간다면 나중에 메모리 공간을 모두 차지 할 수 있다는 문제점이 있다.

    println(firstName)
}