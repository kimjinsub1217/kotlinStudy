package com.example.kotlinstudy
/*
    정수타입
이름    Byte, Short, Int, Long
크기     1      2     4    8

    실수타입
이름    Float, Double
크기      4       8

저장 가능 범위
Byte : -128 ~ 127
Short : -3만 2768 ~ 3만 2767
Int : -21억 4748만 3648 ~ 21억 4748만 3647
Long : -922경 3372조 0368억 5477만 5808 ~ 922경 3372조 0368억 5477만 5807
Float : 1.410 - 45 ~ 3.40282351038
Double : 4.910 - 324 ~ 1.797693134862315710308



 */



fun main(args: Array<String>): Unit {
    val num1: Byte = 127
    println(num1)

    val num2: Short = 3000 * 10
    println(num2)

    var num3: Int = 12_3456_7890 // 알아보기 쉽게 _사용 가능
    println(num3)

    num3 = 0xFF_88_88
    println(num3)

    var num4: Long = -123_4567_8900_0000
    println(num4)

    num3 =num1 +num2
    println(num3)

    num4 = num3 + 10L
    println(num4)

    var num5:Float=77.7f
    val num6: Double=77.7777
    num5 = num5+num6.toFloat()
    println(num5)

}
