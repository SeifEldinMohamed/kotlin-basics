package oop.principles.polymophrism.run_time.task

interface Shape {
    fun calculateArea(): Double
}

class Square(private val side: Double) : Shape {
    override fun calculateArea(): Double {
        return side * side
    }
}

class Circle(private val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(private val base: Double, private val height: Double) : Shape {
    override fun calculateArea(): Double {
        return 0.5 * base * height
    }
}

fun printArea(shape: Shape) {
    val area = shape.calculateArea()
    println("The area is: $area")
}

fun main() {
    val square = Square(5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(4.0, 6.0)

    val shapes = listOf(square, circle, triangle)

    for (shape in shapes) {
        printArea(shape)
        println("-------")
    }
}
