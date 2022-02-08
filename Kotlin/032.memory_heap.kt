package com.example.kotlinstudy.Kotlin

//heap : 변수가 차곡차곡 쌓이는 스택과 달리 힙 영역에는 임의의 위치에 객체가 생성된다.
//object{..}표현식은 힙영역에 객체를 생성하며,각 생성된 객체의 좌푯값을 갖는다.
//참조 변수 : 실제 값을 가지지 않고 객체의 좌표만 저장하는 변수
//좌표값 : 객체의 좌푯값

fun main(args: Array<String>) { //스택영역: args
    val car = object { //스택영역: car object부분이 실행되면서 heap 영역에 객체가 형성된다.
        val name: String = "huracan"
        val color: String = "black"
    }

    println("차 종류: ${car.name}")
    println("차 색상: ${car.color}")
}
