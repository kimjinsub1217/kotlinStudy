package com.example.kotlinstudy.Kotlin

// 생성자는 여러 개를 둘 수 있다.
// 클래스 이름 옆에 오는 생성자는 주 생성자라고 한다.
// 클래스 내부에 오는 생성자는 보조 생성자라고 한다.

class Time(val second: Int) {
    init {
        println("init 블록 실행중")
    }

    // 보조 생성자 1
    constructor(minute: Int, second: Int) : this(minute * 60 + second) { // 분과 초로 Time의 인스턴스를 초기화할 수 있는 보조 생성자를 정의한다.
        println("보조 생성자 1 실행중")                                           // 주 생성자가 있으면 주 생성자를 먼저 호출 해주어야 한다.
                                                                               // this(인수)는 이 클래스에 포함된 또 다른 생성자를 호출하는 문법
    }

    // 보조 생성자 2
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second){ // 시, 분, 초로 Time의 인스턴스를 초기화 할 수 있는 보조 생성자를 정의한다.
        println("보조 생성자 2 실행중")                                                           // 주 생성자를 먼저 호출해 준다.
    }

    init {
        println("또 다른 init 블록 실행중")
    }
}

fun main(args:Array<String>){
    println("${Time(15,6).second} 초")
    println("${Time(6,3,17).second} 초")
}

