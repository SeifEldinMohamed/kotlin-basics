fun main() {
    /** if **/
    /** syntax:
    if (condition) {
        // block of code to be executed if the condition is true
    }
    **/
    if (20 > 18) {
        println("20 is greater than 18")
    }

    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }

    /** else **/
    /** syntax:
    if (condition) {
        // block of code to be executed if the condition is true
    } else {
        // block of code to be executed if the condition is false
    }
     **/
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    /** else if **/
    /**
    if (condition1) {
        // block of code to be executed if condition1 is true
    } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
    } else {
        // block of code to be executed if the condition1 is false and condition2 is false
    }
     **/
    val time2 = 22
    if (time2 < 10) {
        println("Good morning.")
    } else if (time2 < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    /** If..Else Expressions **/
    val time3 = 20
    val greeting = if (time3 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
    // Good Evening

    /** When **/
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result) // Outputs "Thursday" (day 4)
}