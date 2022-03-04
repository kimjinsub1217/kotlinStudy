package com.example.kotlinstudy.Kotlin.closed_range_interface

//start : 프로터티는 구간의 최소값
//endInclusive : 구간의 최대값
//contains : in연산자를 지원하는 역할을 하며 value >= start && value <= endlnclusive 기본 구현 제공
//isEmpty : 구간이 비어 있는지, 구간에 포함되는 객체가 존재하지 않는지 여부를 반환한다. start > endlnclusive

fun main(args: Array<String>) {
    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println(intRange.start)
    println(longRange.endInclusive)
    println('*' in charRange)
    println(charRange.isEmpty())
}