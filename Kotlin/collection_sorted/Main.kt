package com.example.kotlinstudy.Kotlin.collection_sorted

fun main(args: Array<String>) {
    val list = listOf(43, 76, 28, 19, 22, 68)

    //오름차순으로 정렬이 된다.
    println(list.sorted())

    //내림차순으로 정렬이 된다.
    println(list.sortedDescending())
}