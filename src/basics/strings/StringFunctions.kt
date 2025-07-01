package basics.strings

import java.util.Locale

fun main() {

    /** Length() **/
    val slogan = "Kotlin is awesome!"
    val sloganLength = slogan.length // 1 based
    println(sloganLength)  // Output: 18

    /** substring(startIndex, endIndex) **/
    val userName = "Seif Mohamed"
    val firstName = userName.substring(startIndex = 0, endIndex = 4) // Extracts "Seif"
    println(firstName)  // Output: Seif

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

//    val turkishText = "istanbul"
//    println(turkishText.uppercase(Locale("tr", "TR"))) // Output: İSTANBUL (Turkish-specific uppercase)
//    println(turkishText.uppercase(Locale.US)) // Output: ISTANBUL (Standard uppercase)

    /** trim() **/
    val message = "   Hello, world!    "
    val trimmedMessage = message.trim()
    println(trimmedMessage)  // Output: Hello, world!

    /** contains(other) **/
    val name = "Seif Mohamed"
    val hasDoe = name.contains(other = "Mohamed")
    println(hasDoe)  // Output: true

    /** replace(oldValue, newValue) **/
    val helloWorld = "Hello, world!"
    val newGreeting = helloWorld.replace(oldValue = "world", newValue =  "Kotlin")
    println(newGreeting)  // Output: Hello, Kotlin!

    /** split() **/
    val colors = "red,green,blue"
    val colorList = colors.split(",")
    println(colorList)  // Output: [red, green, blue]


    /** indexOf(string) and lastIndexOf(string) **/
    val sentence = "Kotlin language Kotlin"
    val firstKotlin = sentence.indexOf(string = "Kotlin") // Index of first "Kotlin"
    val lastKotlin = sentence.lastIndexOf(string = "Kotlin") // Index of last "powerful"
    println(firstKotlin)  // Output: 0
    println(lastKotlin)  // Output: 16


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

//    val user1 = "Seif"
//    user1[0] = 'm'
}