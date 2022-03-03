package com.example.kotlinstudy.Kotlin.access_modifier_private

private var num = 10 // 파일 내에서만 접근 가능
private fun print() //파일 내에서만 접근 가능
        = println(num)

public fun hello(value: Int)//어디서나 접근 가능
{
    num =value
    print()
}

public class Person(age:Int)//어디서나 접근 가능
{
    public var age = age
        private set

    public val isYoung public get() = age < 30
}