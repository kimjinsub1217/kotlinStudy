package com.example.kotlinstudy.Kotlin.mutable_map_interface

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    //빈 객체 생성 후 {} 출력
    val map: MutableMap<String, String> = mutableMapOf()
    println(map)

    //Color를 키로 Red를 값으로 하는 쌍을 map에 추가 map이라는 키가 map에 들어있지 않아 null 출력
    println(map.put("Color","Red"))
    println(map)

    println(map.put("Color", "Orange"))
    println(map)

    map["Color"] = "Yellow"
    println(map)

    map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye" to "잘 가"))
    println(map)

    println(map.remove("Hi"))
    println(map)

    println(map.remove("Bye","잘"))
    println(map)

    println(map.remove("Bye","잘 가"))
    println(map)

    map.clear()
    println(map)
}