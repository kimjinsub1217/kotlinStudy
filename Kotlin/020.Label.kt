package com.example.kotlinstudy.Kotlin

/*
    Label : 중첩 반복문 사용중하고 있다 가정 하에 안쪽 반복문에 break로 빠져나와도 바깥 반복문은 여전히
            돌게되는데 이 문제를 해결하기 위해 사용
 */

fun main(args:Array<String>):Unit{
    var x = 0
    var y = 0

    outer@ while (x<=20){
        y=0
        while(y<=20){
            if(x+y==15 &&x-y==5)
                break@outer
            y+=1
        }
        x+=1
    }
    print("x:$x,y:$y")
}