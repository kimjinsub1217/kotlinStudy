package com.example.kotlinstudy.Kotlin.measure_performance

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    println(
        measureTimeMillis {
            var sum = 0L
            for (i in 1..100000000)
                sum += i
        })

    println(measureTimeMillis {
        var sum = 0L
        for (i in 1..100000000)
            sum += i
    })
}