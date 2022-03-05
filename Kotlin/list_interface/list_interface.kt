package com.example.kotlinstudy.Kotlin.list_interface

//get : List의 index 번째 원소를 반환하는 멤버 함수이다.
//indexOf : element 원소가 List의 몇 번째 인덱스에 위치해있는지를 반환하는 멤버 함수
//lastIndexOf : 마지막으로 일치하는 원소의 인덱스를 반환한다,
//listIterator : List에 특화된 lterator를 반환하는 멤버 함수이다.
//subList [fromIndex, toIndex] 구간의 원소를 뽑아 새로운 List를 만들어 반환하는 멤버 함수

fun main(args:Array<String>){
    val list:List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0])
    println(list.indexOf(1.14))
    println(list.indexOf(9.31))
    println(list.lastIndexOf(1.14))
    println(list.subList(0,3))
}