package com.example.kotlinstudy.Kotlin

//힙 영역에서 생성한 변수는 어느 블록에서 생성했던 간에 블록을 빠져나와도 지워지지 않는다.
//힙이라는 공간이 없었으면 main 함수의 product 변수와 printProductInfo 함수의 product
//매개변수가 각각 자신만의 nama과 price 변수를 가지게 됬을 것이다.
//이처럼 힙 영역을 두면 하나의 객체를 여러 참조 변수에서 공유하는 형태로 사용할 수 있어 메모리 공간을 절약할
//수 있다.

fun main(args: Array<String>) {//스택영역에 args 들어간다
    val product: Product       //스택영역에 product 들어간다.
    product = createProduct()  //createProduct() 함수안으로 실행 흐름 이동
                               //apple 참조 변수는 createProduct() 함수가 끝났으므로 스택은 지워
                               //지고 apple 참조 변수가 가리키고 있던 객체는 힙에서 지워지지 않는다.
                               //이 후 스택영역에서 지워진 apple이 가리키던 힙 영역이 product가 가리키게 된다.
                               //
    printProductInfo(product)
    println()
    processProduct(product)
    printProductInfo(product)
}

fun createProduct(): Product {
    val apple = Product()
    //Product 인스턴스 생성하고 apple 참조변수에 위치를 저장한다.
    //스택 영역 apple에 힙 영역 name과 price가 나타남
    //힙영역
    //name : ""
    //price : 0

    apple.name = "사과"
    apple.price = 1000
    //apple 참조 변수가 가리키는 객체의 프로퍼티의 값에 채움
    //힙영역
    //name : "사과"
    //price : 1000
    return apple
    //apple 참조 변수가 가지고 있는 참조값을 반환

}

fun processProduct(product: Product) {
    // price에 가격을 500 더한다.
    product.price += 500

}

fun printProductInfo(product: Product) {
    //ㅊ
    println("이름 : ${product.name}")
    println("가격 : ${product.price}")
}
