package com.example.kotlinstudy.Kotlin

//가비지 컬렉션 : 객체는 분명 힙 영역에 존재하지만 위치를 모르기 떄문에 다시 찾을 수 없을 떄
//               미아가 된 객체는 메모리 공간이 부족해 질 정도까지 쌓이면 가비지 컬렉션이
//               라는 기능에 의해 소멸한다.

fun main(args: Array<String>) {
    var result = ""
    var i = 1

    while (i < 100) {
        result += "$i "
        i += 1
    }
    print(result)
}