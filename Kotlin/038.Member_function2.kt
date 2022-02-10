package com.example.kotlinstudy.Kotlin

fun main(args: Array<String>) {
    val building = Building()
    building.name = "A 오피스텔"
    building.data = "2022-01-01"
    building.area = 120*8

    building.print()
}