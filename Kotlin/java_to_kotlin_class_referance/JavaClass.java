package com.example.kotlinstudy.Kotlin.java_to_kotlin_class_referance;

public class JavaClass {
    public static <T> void printClassInfo(Class<T> clazz) {
        System.out.println(clazz.getCanonicalName());
    }
}
