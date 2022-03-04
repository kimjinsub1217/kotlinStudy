package com.example.kotlinstudy.Kotlin.inherit_from_generic

interface plusable<T>{
    operator fun plus(other:T):T
}