package com.example.kotlinstudy.Kotlin.map_interface

import android.annotation.SuppressLint

/*
* size : Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티
* Keys : Map의 키들만 갖는 프로터티이다. Map의 키는 중복되지 않기 때문에 Set 타입으로 되어있다.
* values : Map의 값들만 갖는 프로퍼티이다. Map의 값은 중복될 수 있기 떄문에 Collection타입으로 되어 있다.
* entries : Map에 들어있는 모든 키와 값 쌍들을 갖는 프로퍼티이다. 키와 값은 Entry 타입으로 감싸여 있다.
* isEmpty :  Map이 비어있는지 여부를 반환한다.
* contains Key : Map에 Key에 해당하는 키가 들어있는지 여부를 반환한다.
* contains Value : Map에 value에 해당하는 값이 들어있는지 여부를 반환한다.
* get : key에 해당하는 값을 반환하는 연산자 멤버 함수이며 key에 해당하는 값이 없으면 null 반환한다.
*       Map 타입에 []연산자를 사용할 수 있도록 하는 역할을 한다.
* getOrDefault : key에 해당하는 값을 반환하되, key에 해당하는 값이 없으면 defaultValue를 반환한다.

 */

@SuppressLint("NewApi")
fun main(args: Array<String>) {
    val map: Map<String,String> = mapOf("Apple" to "사과","Banana" to "바나나")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa","코코아"))

}