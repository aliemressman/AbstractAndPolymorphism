package com.aliemressman.calisma

fun main() {
    val circle = Circle(8.9)
    val rectangle = Rectangle(5.0, 7.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    val shapes = arrayOf(circle, rectangle, triangle)

    for (shape in shapes) {
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
        println("")
    }
}

abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Triangle(private val side1: Double, private val side2: Double, private val side3: Double) : Shape() {
    override fun area(): Double {
        val seriPerimeter = perimeter() / 2
        return Math.sqrt(seriPerimeter * (seriPerimeter - side1) * (seriPerimeter - side2) * (seriPerimeter - side3))
    }
    override fun perimeter(): Double {
        return side1 + side2 + side3
    }
}