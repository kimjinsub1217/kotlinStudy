package com.example.kotlinstudy.Kotlin.mutable_list_lterator_interface

//set: 커서가 가리키는 위치의 원소를 element로 교체한다.
//add: 커서가 가리키는 위치에 element를 추가함

fun main(args:Array<String>){
    val list = mutableListOf(1,2,3)
    val iter: MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next();iter.next()
    iter.add(7)
    println(list)

    iter.next();iter.set(10)
    println(list)
}