package com.example.kotlinstudy.Kotlin

//특정 클래스와 강한 연관이 있는 함수는 아예 클래스 안으로 내장 시킬 수 있다.
//Building 클래스 안에 print 함수가 내장되어 있다. 이렇게 클래스에 내장된 함수를
//멤버함수라고 부른다
//각 프로퍼티 이름 앞에 this.가 붙어있다. this는 멤버 함수가 호출될 떄 어떤 객체로부터 호출된
//것인지를 나타낸 키워드이다.
class Building {
    var name = ""  // 건축명
    var data = ""  //건축일자
    var area = 0   //면적(m2)


    fun print() {
        println("이름 : " + this.name)
        println("건축일자 : " + this.data)
        println("면적 : ${this.area}m2")
    }

}