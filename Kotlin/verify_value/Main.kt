package com.example.kotlinstudy.Kotlin.verify_value

fun func(num: Int?) {
    checkNotNull(num)
    check(num!! >= 0)
}

fun func2(num: Double?){
    requireNotNull(num)
    require(num!!.isNaN())
}


fun main(args: Array<String>) {
    func(10)
    func2(0.0/0.0)
}