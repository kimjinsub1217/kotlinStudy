package com.example.kotlinstudy.Kotlin.kotlin_to_java_property;

import com.example.kotlinstudy.Kotlin.Java_to_kotin_null_safety.KotlinClass;

public class Main
{
    public static void main(String[] args)
    {
        KotlinClass kotlin = new KotlinClass();
        kotlin.setNum(16);
        System.out.println(kotlin.getNum());
    }
}
