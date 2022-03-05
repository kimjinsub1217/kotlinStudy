package com.example.kotlinstudy.Kotlin.string_builder_class

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val builder = StringBuilder()
        .append("2022 ")
        .append("제티 ")
        .append("우유 ")


    val result = builder.toString()
    println(result)

}