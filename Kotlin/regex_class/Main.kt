package com.example.kotlinstudy.Kotlin.regex_class

fun main(args:Array<String>){
    val regex = Regex("[0-9]+")
    val str ="432432423"
    val str2 ="323 4745 23"

    println(regex matches  str)
    println(regex matches  str2)
    println(regex.replace(str2,"숫자"))
}