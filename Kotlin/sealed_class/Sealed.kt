package com.example.kotlinstudy.Kotlin.sealed_class

sealed class Outer {
    class One : Outer()
    class Two : Outer()
    class Three : Outer()
}