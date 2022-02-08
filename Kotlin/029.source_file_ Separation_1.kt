package com.example.kotlinstudy.Kotlin

//서로 관련 있는 함수끼리 묶어 하나의 파일로 추출하면 나중에 관리하기 편하다.

//num1 과 num2 중 더 큰 수를 반환하는 함수
fun max(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

//num1과 num2 중 더 작은 수를 반환하는 함수
fun min(num1: Int, num2: Int): Int = if (num1 < num2) num1 else num2

//num의 절대값을 반환하는 함수
fun abs(num:Int):Int = if(num>=0)num else -num