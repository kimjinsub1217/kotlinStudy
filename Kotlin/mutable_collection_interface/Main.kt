package com.example.kotlinstudy.Kotlin.mutable_collection_interface


/*
* add : 컬렉션에 element 원소를 추가한다.원소가 성공적으로 추가된다면 true 반환
* addAll : elements 컬렉션의 모든 원소를 컬렉션에 추가한다. 하나라도 추가 된다면 true 한 개도 추가되지 않으면 false
* remove : element와 일치하는 원소를 하나 제거한다. 원소가 성공적으로 제거되면 true, 해당하는 원소가 컬렉션에 없으면 false
* retainAll : element 컬렉션의 원소와 일치하는 원소만 남기고 컬렉션에서 모두 제거한다. 원소가 하나라도 제거되면 true 삭제된 원소가 없으면 false
* clear : 모든 원소를 삭제하는 멤버 함수
 */
fun main(args: Array<String>) {
    val mutableList: MutableCollection<Int> = mutableListOf(1, 2, 4, 2, 3, 2, 5)
    println(mutableList)

    mutableList.add(1)
    println(mutableList)

    mutableList.addAll(listOf(3, 2, 4))
    println(mutableList)

    mutableList.remove(1)
    println(mutableList)

    mutableList.removeAll(listOf(1, 2))
    println(mutableList)

    mutableList.retainAll(listOf(3, 5))
    println(mutableList)

    mutableList.clear()
    println(mutableList)

}