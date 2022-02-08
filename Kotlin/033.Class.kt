package com.example.kotlinstudy.Kotlin

//class : 일일이 객체를 만드는 것이 너무 번거로운걸 해결하기 위해 사용
//      : 객체를 찍어내기 위한 설계도이며 클래스 안에 포함된 피라미터는,이 클래스대로 객체를 만들면
//      : 객체 안에 이렇게 생긴 프로퍼티가 들어갈 것이라고 알려주기 위한 모양 변수이다.
//      : EX) 붕어빵 틀

class Poketmon {
    var name: String = ""
    var type: String = ""
}

fun main(args: Array<String>) {


    val poketmon = Poketmon()
    poketmon.name = "이상해씨"
    poketmon.type = "풀"

    val poketmon2 = Poketmon()
    poketmon2.name = "파이리"
    poketmon2.type = "불"

    println("포켓몬 이름: ${poketmon.name} 타입: ${poketmon.type}")
    println("포켓몬 이름: ${poketmon2.name} 타입: ${poketmon2.type}")

}

