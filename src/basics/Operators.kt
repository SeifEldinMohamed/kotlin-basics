package basics

fun main() {
    /** arithmetic operators **/

    /** Addition (+) **/
    println("Addition (+)")
    val num1 = 10
    val num2 = 20
    val sum = num1 + num2
    println(sum)  // Output: 30
    println("/////////////////////////////////////////////")

    /** Subtraction (-) **/
    println("Subtraction (-)")
    val difference = num2 - num1
    println(difference)  // Output: 10
    println("/////////////////////////////////////////////")

    /** Multiplication (*) **/
    println("Multiplication (*)")
    val width = 5
    val height = 8
    val area = width * height
    println(area)  // Output: 40
    println("/////////////////////////////////////////////")

    /** Division (/) **/
    println("Division (/)")
    val apples = 12
    val people = 3
    val applesPerPerson = apples / people  // Integer division (4)
    println(applesPerPerson)
    println("/////////////////////////////////////////////")

    /** Modulo (%) **/
    println("Modulo (%)")
    val num5 = 17
    val num6 = 5
    val remainder = num5 % num6
    println(remainder)  // Output: 2
    println("/////////////////////////////////////////////")


    /** Increment (++) and Decrement (--) **/
    // Pre-increment (e.g., ++x)
    println("Pre-increment")
    var count = 0
    println(++count)  // Output: 1 (increments then print new value)
    println(count)  // Output: 1 (new value)
    println("/////////////////////////////////////////////")

    // Post-increment (e.g., ++x)
    println("Post-increment")
    var count2 = 0
    println(count2++)  // Output:0 (uses original value then increment)
    println(count2)  // Output: 1 (now incremented)
    println("/////////////////////////////////////////////")

    // Pre-decrement (e.g., ++x)
    println("Pre-decrement")
    var count3 = 5
    println(--count3)  // Output: 4 (decrements then print new value)
    println(count3)  // Output: 4 (new value)
    println("/////////////////////////////////////////////")

    // Post-decrement (e.g., ++x)
    println("Post-decrement")
    var count4 = 5
    println(count4--)  // Output: 5 (uses original value then decrement)
    println(count4)  // Output: 4 (now decremented)
    println("/////////////////////////////////////////////")

    /** Assignment operators **/
    println("Assignment operators")
    var number = 5
    // number+=3 // equals: number = number + 3
    number += 3
    println(number) // Output: 8
    println("/////////////////////////////////////////////")

    /** Comparison operators **/
    println("Comparison operators")
    val number2 = 5
    val number3 = 10
    println(number2 == number3) // Output: false
    println(number2 != number3) // Output: true
    println(number2 > number3) // Output: false
    println(number2 < number3) // Output: true
    println("/////////////////////////////////////////////")

    /** Logical operators **/
    println("Logical operators")
    val number4 = 5
    println(number4 < 5 &&  number4 < 10) // Output: false
    println(number4 < 5 || number4 < 6) // Output: true
    println("/////////////////////////////////////////////")

}