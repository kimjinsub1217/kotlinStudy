package com.example.kotlinstudy.Kotlin.progression_practice

fun IntProgression.print() {
    print("first:${this.first}, ")
    print("last:${this.last}, ")
    println("step:${this.step}")

    for (i in this)
        print("$i")
    println("\n")
}

fun main(args: Array<String>) {
    //downTo : 역순으로 진행하는 Progression을 반환하는 infix 확장 함수
    val prog: IntProgression = 7 downTo 3
    prog.print()

    //reversed : Progression을 뒤집는 역할을 한다
    val prog2: IntProgression = (3..7).reversed()
    println(prog == prog2)
    prog2.print()

    //step : 원래의 Progression에 step 프로퍼티 값만 바꿔주는 역할을 한다.
    val prog3: IntProgression = (1..10) step 3
    prog3.print()

    //downTo,step을 섞어서 사용이 가능하다. 10에서 2까지 3칸식 진행한다.
    val prog4: IntProgression = 10 downTo 2 step 3
    prog4.print()

    //[시작, 끝]로 진행하는 Progression을 반한하는 확장 함수
    val prog5: IntProgression = 2 until 5
    prog5.print()
}