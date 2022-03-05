package com.example.kotlinstudy.Kotlin.list_iterator_interface

//hasPrevious : 이전 원소가 존재하는지 여부를 반환한다.
//previous : 이전 원소를 반환하고, ListIterator의 커서를 뒤로 한칸 옮긴다.
//nextIndex : 다음 원소의 인덱스를 반환한다. 커서를 옮기지는 않는다.
//previousIndex : 이전 원소의 인덱스를 반환한다. 커서를 옮기지는 않는다.

private fun moveToNext(iter: ListIterator<Int>){
    print("${iter.hasPrevious()}, ")
    print("${iter.hasNext()}, ")
    print("${iter.previousIndex()}, ")
    print("${iter.nextIndex()}, ")
    println("${iter.next()}")
}

fun main(args: Array<String>){
    val iter:ListIterator<Int> = listOf(10,20,30).listIterator()

    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}