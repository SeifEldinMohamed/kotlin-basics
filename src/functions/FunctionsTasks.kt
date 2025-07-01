package functions

fun main() {

    println(calculator(operator = '+', num1 = 10f, num2 = 12.0f))
    println(calculator(operator = '*', num1 = 10f, num2 = 12.0f))
    // println(calculator(operator = '&', num1 = 10f, num2 = 12.0f))

    println(calculator2(operator = '-',  10f,  12.5f, 20f))
    println(calculator2(operator = '+',  10f,  12.5f, 20f, 17.5f))

}

fun calculator(operator: Char, num1: Float, num2: Float): Float {
    return when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Invalid operator")
    }
}

fun calculator2(operator: Char, vararg numbers: Float): Float {
    return when (operator) {
        '+' -> numbers.sum()
        '-' -> numbers.reduce { acc, num -> acc - num }
        '*' -> numbers.reduce { acc, num -> acc * num }
        '/' -> numbers.reduce { acc, num -> acc / num }
        else -> throw IllegalArgumentException("Invalid operator")
    }
}
/**
 * The reduce() function for combining elements of a collection into a single value. It takes a lambda function that takes two arguments:

    Accumulator: The accumulated value so far.
    Element: The current element being processed.
    The lambda function returns the updated accumulator value, which is then used in the next iteration.
 *
 * **/