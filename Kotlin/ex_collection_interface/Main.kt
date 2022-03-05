package com.example.kotlinstudy.Kotlin.ex_collection_interface

//size : 원소의 개수를 갖는 프로퍼티이다.
//isEmpty() : 컬렉션이 비어있는지 여부를 반환한다.
//contains : element 원소가 컬렉션에 포함되어 있는지 여부를 반환하는 연산자 멤버 함수이다.
//containsAll : element의 원소들이 컬렉션에 모두 포함되어 있는지 여부를 반환하는 연산자 멤버함수이다.
//iterator : 컬렉션의 각 원소들 순회하는 Iterator<E> 타입의 객체를 반환하는 연산자 멤버 함수이다.


fun main(args:Array<String>){
    val list:Collection<Int> = listOf(18,1,1,4)

    println(list.size)
    println(list.isEmpty())
    println(18 in list)

    for(i: Int in list)
        print("$i ")
}