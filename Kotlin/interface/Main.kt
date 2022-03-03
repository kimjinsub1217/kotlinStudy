package com.example.kotlinstudy.Kotlin.`interface`

interface Printable {
    fun print(): Unit
}

class AAAB2 : Printable {
    override fun print() {
        print("Hello")
    }
}

fun print(anything: Printable) {
    anything.print()
}

fun main(args: Array<String>) {
    print(AAAB2())
}

