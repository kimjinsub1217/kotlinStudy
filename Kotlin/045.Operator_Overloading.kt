package com.example.kotlinstudy.Kotlin

class Point(var x: Int = 0, var y: Int = 0) {
    // 멤버 함수 정의문 앞에 operator를 붙였다 의미는 Point의 인스턴스 간에 연산자를 사용
    // 했을 때 이 멤버 함수를 대신 호출해달하는 뜻
    // plus는 정해진 이름이며 다른 이름을 사용하면 연산자 오버로딩이 제대로 되지 않는다.
    // + 연산자를 오버로딩한다.
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    // minus는 -연산자를 오버로딩 한다.
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    // times는 * 연산자를 오버로딩 한다.
    operator fun times(number: Int): Point {
        return Point(x * number, y * number)
    }

    // div는 / 연산자를 오버로딩한다.
    operator fun div(number: Int): Point {
        return Point(x / number, y / number)
    }

    // 인스턴스의 좌푯값을 출력하는 멤버 함수
    fun print(){
        println("x:$x,y:$y")
    }
}