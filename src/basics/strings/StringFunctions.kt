package basics.strings

import java.util.Locale

fun main() {

// Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("Number %.4f", 3.141592)
    println(floatNumber)// +3.1416

    val helloString = String.format("%s %S", "HELLO","world")
    println(helloString) // HELLO WORLD
    val name10 = "seif"
    for (char in name10) {
        println(char)
    }

    val name7 = "fasdf"
    println(name7[0])

    /** Length() **/
    val slogan = "Kotlin is awesome!"
    val sloganLength = slogan.length
    println(sloganLength)  // Output: 18

    /** substring(startIndex, endIndex) **/
    val quote = "Seif Mohamed"
    val subQuote = quote.substring(startIndex = 0, endIndex = 4) // Extracts "Seif"
    println(subQuote)  // Output: Seif

    /** take(n) **/
    val greeting = "Good morning!"
    val shortGreeting = greeting.take(4) // Takes the first 4 characters
    println(shortGreeting)  // Output: Good

    /** toUpperCase() and toLowerCase() **/

    val city = "New York"
    val upperCity = city.uppercase(Locale.getDefault())
    val lowerCity = city.lowercase(Locale.getDefault())
    println(upperCity)  // Output: NEW YORK
    println(lowerCity)  // Output: new york

    /** trim() **/
    val message = "   Hello, world!    "
    val trimmedMessage = message.trim()
    println(trimmedMessage)  // Output: Hello, world!

    /** contains(other) **/
    val name = "John Doe"
    val hasDoe = name.contains(other = "Doe")
    println(hasDoe)  // Output: true

    /** replace(oldValue, newValue) **/
    val helloWorld = "Hello, world!"
    val newGreeting = helloWorld.replace(oldValue = "world", newValue =  "Kotlin")
    println(newGreeting)  // Output: Hello, Kotlin!

    /** split() **/
    val colors = "red green. blue "
    val colorList = colors.split(".")
    println(colorList)  // Output: [red green,  blue ]


    /** indexOf(string) and lastIndexOf(string) **/
    val sentence = "powerful language powerful"
    val firstKotlin = sentence.indexOf(string = "Kotlin") // Index of first "Kotlin"
    val lastPowerful = sentence.lastIndexOf(string = "powerful") // Index of last "powerful"
    println(firstKotlin)  // Output: -1
    println(lastPowerful)  // Output: 18


    /**  startsWith(prefix) and endsWith(suffix) **/
    val website = "www.example.com"
    val startsWithWww = website.startsWith(prefix = "www.")
    val endsWithCom = website.endsWith(suffix = ".com")
    println(startsWithWww)  // Output: true
    println(endsWithCom)  // Output: true

    /** StringBuilder() **/
    val builder = StringBuilder("Hello")
    builder.append(", ") // Appends the specified string to this character sequence.
    builder.append("world!")
    val finalString = builder.toString()
    println(finalString)  // Output: Hello, world!
    builder[0] = 's'
    println(builder.toString())  // Output: sello, world!

}