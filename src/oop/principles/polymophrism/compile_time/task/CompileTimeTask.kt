package oop.principles.polymophrism.compile_time.task

class Calculator(val value: Int = 0) {

    // Function Overloading
    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun subtract(a: Int, b: Int, c: Int): Int {
        return a - b - c
    }

    // Operator Overloading
    operator fun minus(other: Calculator): Calculator {
        return Calculator(this.value - other.value)
    }
}

fun main() {
    val calculator = Calculator()

    // Demonstrating function overloading
    println("Subtract 3 from 5 (Int): ${calculator.subtract(5, 3)}")
    println("Subtract 3.5 from 7.5 (Double): ${calculator.subtract(7.5, 3.5)}")
    println("Subtract 2 and 1 from 5 (Int): ${calculator.subtract(5, 2, 1)}")

    // Demonstrating operator overloading
    val calc1 = Calculator(10)
    val calc2 = Calculator(4)
    val calc3 = calc1 - calc2

    println("Subtract Calculator values: ${calc3.value}")

}