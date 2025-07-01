package functions
fun main() {
    myFunction()

    println(greet("Seif"))
    val functionReturn = greet("Ahmed")

    //  multiple parameters
    val sum = add(5, 10)
    println(sum)

    // parameter default value
    println(greet2())

    // Named arguments
    println(greet2(name = "Kotlin"))
    val sum2 = add2(b = 5.5f, a = 10)
    println(sum2)

    // pass array as an arguments
    val arr = arrayOf(1,245,3,24)
    println(getMax(arr))

    // vararg
    val alternatingSum = getMax2(1,245,3,24)
    println("The alternating sum is $alternatingSum")

    greet4("Hello","Seif","Ahmed", "Mohamed")

    // passing array to vararg
    val moreNames = arrayOf("Kareem", "Hazem")
    greet4(*moreNames)
    greet4("Hello","Seif", *moreNames,"Ahmed", "Mohamed")

    println(greetingWithAge(20, "Seif", "Mohamed", "Hazem"))

    // 3 - 4 + 5 - 2 + 1 - 2 + 3
}


fun myFunction(): Unit {
    println("I just got executed!")
}

fun greet(name: String): String {
    return "Hello, $name!"
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int, b: Float): Float {
    return a + b
}

fun greet2(name: String = "World"): String {
    return "Hello, $name!"
}

// Single-Expression Functions
fun greet3(name:String = "World") = "Hello, $name"

// Unit Returning Functions
fun printMessage(message: String): Unit {
    println(message)
}

fun getMax(numbers: Array<Int>):Int {
    var max = numbers[0]
    for (number in numbers){
        if (number > max)
            max = number
    }
    return max
}

// vararg with another parameter
fun greet4(vararg names: String) {
    for (name in names) {
    }
}


fun getMax2(vararg numbers:Int): Int {
    var max = numbers[0]
    for (number in numbers){
        if (number > max)
            max = number
    }
    return max
}

fun greetingWithAge(age: Int, vararg names: String):String{
    var greetingString = ""
    for (name in names) {
        greetingString += "greeting $name \n"
    }
    greetingString += "and their ages = $age"
    return greetingString
}

fun sumTwoNumbers(x:Int, y:Int) = x + y

// equals
//fun sumTwoNumbers2(x:Int, y:Int): Int {
//    return x + y
//}