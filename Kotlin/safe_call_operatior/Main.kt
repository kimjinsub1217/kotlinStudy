package com.example.kotlinstudy.Kotlin.safe_call_operatior

import com.example.kotlinstudy.Kotlin.Building

fun main(args:Array<String>){
    var obj: Building?=null
    obj?.print()
    obj?.name="건물"

    obj=Building()
    obj?.name="서울월드컵경기장"
    obj?.data="2022년 1월 1일"
    obj?.area=22_222
    obj?.print()
}