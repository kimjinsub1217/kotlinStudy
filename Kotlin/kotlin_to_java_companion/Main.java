package com.example.kotlinstudy.Kotlin.kotlin_to_java_companion;

public class Main {
    public static void main(String[] args){
        KotlinClass2.Companion.setNum(30);
        System.out.println(KotlinClass2.Companion.getNum());
        KotlinClass2.Companion.hello();
    }
}
