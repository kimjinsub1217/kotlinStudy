package com.example.kotlinstudy.Kotlin.mutable_list_interface

/*
*add : index 위치에 element를 추가한다.
* addAll : index 위치에 element 컬렉션에 있는 모든 원소를 추가하는 멤버 함수
* set : 연산자를 오버로딩하는 멤버함수이다.  index 번째 위치의 원소를 element로 교체한다.
* removeAt : index번째 원소를 삭제하는 멤버함수이다.
 */


fun main(args:Array<String>){
    val list:MutableList<Char> = mutableListOf('c','a','r')
    println(list)

    list.add(1,'%')
    println(list)

    list.addAll(0, listOf('L','P'))
    println(list)

    println(list.set(2,'/'))
    println(list)

    println(list.removeAt(4))
    println(list)
}