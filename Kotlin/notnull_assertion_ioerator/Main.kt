package com.example.kotlinstudy.Kotlin.notnull_assertion_ioerator

import com.example.kotlinstudy.Kotlin.Building

fun main(args:Array<String>){
    var obj: Building?=Building()
    obj!!.name="서울시청"
    println(obj!!.name)

    obj =null
    obj?.print()
}