
fun main() {
    myFunction()

    println(greet("Seif"))

    //  multiple parameters
    val sum = add(5, 10)
    println(sum)

    // parameter default value
    println(greet2())

    // Named arguments
    println(greet2(name = "Kotlin"))

    // vararg
    println(getMax(arrayOf(1,245,3,24)))
    greet4("Hello","Seif","Ahmed", "Mohamed")
    // passing array to vararg
    val moreNames = arrayOf("Kareem", "Hazem")
    greet4("Hello","Seif", *moreNames,"Ahmed", "Mohamed")

    /** Task **/
    val alternatingSum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $alternatingSum")

    // 3 - 4 + 5 - 2 + 1 - 2 + 3
}


fun myFunction() {
    println("I just got executed!")
}

fun greet(name: String): String {
    return "Hello, $name!"
}

fun add(a: Int, b: Int): Int {
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
fun greet4(greeting: String, vararg names: String) {
    for (name in names) {
        println("$greeting, $name")
    }
}


fun alternatingSum(vararg numbers:Int): Int {
    var alternatingSum = 0
    for(i in numbers.indices){
        if (i % 2 == 0){
            alternatingSum+= numbers[i]
        }
        else{
            alternatingSum-= numbers[i]
        }
    }
    return alternatingSum
}
