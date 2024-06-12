package oop.principles.abstractClass_and_Interface.abstract_class.interface_kotlin.task

fun interface NumberFilter {
    fun isEven(number: Int): Boolean
}

fun filterNumbers(numbers: List<Int>, filter: NumberFilter): List<Int> {
    val filteredNumbers = numbers.filter { filter.isEven(it) } // == { it %2==0 }
    return filteredNumbers
}

fun main() {
    val filterEven = NumberFilter{ number -> number % 2 == 0 }
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = filterNumbers(numbers, filterEven)
    println("Even numbers: $evenNumbers")
}