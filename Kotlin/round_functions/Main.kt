package com.example.kotlinstudy.Kotlin.round_functions

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    println("${ceil(3.2)}")
    println("${ceil(3.9)}")
    println("${floor(3.2)}")
    println("${floor(3.9)}")
    println("${round(3.2)}")
    println("${round(3.9)}")
    println("${12.33.roundToInt()}")
    println("${23232.34.roundToInt()}")
}