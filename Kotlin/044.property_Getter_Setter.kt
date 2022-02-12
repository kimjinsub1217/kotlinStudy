package com.example.kotlinstudy.Kotlin

//프로퍼티에는 변수뿐만 아니라 Getter/Setter 라고 부르는 특수 함수도 포함되어 있다.

//별도로 정의하지 않으면 다음처럼 디폴트 Getter/Setter가 자동으로 정의된다.
//claa Person{
//  var age: Int =0
//    get() {
//        return field
//    }
//    set(value){
//        field =values
//    }
//}

//프로퍼티는 실제로 데이터가 저장되는 공간(Field)
//함수(Getter)는 저장된 값을 읽으려고 할 때 호출된다.
//함수(Setter)는 값을 저장하려고 할 떄 호출된다.
class Person2{
    var age:Int=0
    get(){ // age 프로퍼티의 Getter
        return field
    }

    set(value){ // age 프로퍼티의 Setter
        field =if(value>=0) value else 0
    }
}