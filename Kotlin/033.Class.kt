package com.example.kotlinstudy.Kotlin

//class : 일일이 객체를 만드는 것이 너무 번거로운걸 해결하기 위해 사용
//      : 객체를 찍어내기 위한 설계도이며 클래스 안에 포함된 피라미터는,이 클래스대로 객체를 만들면
//      : 객체 안에 이렇게 생긴 프로퍼티가 들어갈 것이라고 알려주기 위한 모양 변수이다.
//      : EX) 붕어빵 틀

//인스턴스 : 클래스로부터 생성된 객체는 특별히 인스턴스라고 부른다. 인스턴스는 구체적이라는 뜻이 있으며 클래스라는 틀로부터 구체적으로 만들어지기 때문이다.
//클래스도 함수처럼 클래스 단위로 소스 파일을 분리할 수 있다. 일반적으로 클래스 하나당 파일 하나로 분리하고 파일 이름은 클래스 이름과 동일하게 하는 것을 권장한다.

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

