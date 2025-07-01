package basics.strings

import java.util.Scanner

fun main() {

    // Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)// +3.1416

    // Formats two strings to uppercase, each taking one placeholder
    val helloString = String.format("%S", "hello")
    println(helloString) // HELLO WORLD


//////////////////////////////////////////////////////////////////////////////////////////////////

    val name = "Alice"
    val age = 30

    val formattedString = "My name is %s and I am %d years old."
    println(formattedString.format(name, age)) // This is what we intend to achieve

    /** Mismatch Example (Incorrect Position of Arguments): **/
    // Swapping the order of arguments (age before name)
//    val result1 = formattedString.format(age, name)
//   println(result1)  // This will cause an error

    /** Another Mismatch Example (Mismatch in Number of Arguments): **/
    // Only providing one argument (age) instead of two
//    val result2 = formattedString.format(age)  // This will cause an error
//    println(result2)

}