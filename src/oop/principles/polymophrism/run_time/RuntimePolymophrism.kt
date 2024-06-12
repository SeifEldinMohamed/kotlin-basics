package oop.principles.polymophrism.run_time

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

//fun printArea(shape: Shape) {
//    val area = shape.calculateArea()
//    println("The area is: $area")
//}

fun main() {
    val square = Square(5.0)
    val circle = Circle(3.0)

    square.calculateArea()
    circle.calculateArea()

//    printArea(square)
//    printArea(circle)
}