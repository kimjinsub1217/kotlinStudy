package com.example.kotlinstudy.Kotlin.inherit_from_generic

class Rectangle(val width: Int, val height: Int) : plusable<Rectangle> {
    override fun plus(other: Rectangle) =
        Rectangle(width + other.width, height + other.height)

    override fun toString() = "with: $width, height:$height"
}