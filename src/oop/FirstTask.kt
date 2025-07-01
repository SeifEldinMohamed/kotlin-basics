package oop

class Student(name: String, grade: Int) {
    init {
        println("studentName:$name,Grade:$grade")
    }
}

class Rectangle(private val width: Double, private val height: Double) {
    fun calculateArea(): Double {
        return width * height
    }
}

fun main() {
    val student = Student("omar", 20)
    println("#############")

    val rectangle = Rectangle(2.0, 4.0)
    println("Area :${rectangle.calculateArea()}")
}