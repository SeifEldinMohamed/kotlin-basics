
fun main() {
//    val f = 2437823799
//    println(f.javaClass)

// Formats a floating-point number to display with a + sign and four decimal places
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)// +3.1416

// Formats two strings one lowercase and other to uppercase, each taking one placeholder
    val helloString = String.format("%s %S", "HELLO", "world")
    println(helloString) // HELLO WORLD


    /** Length() **/
    val slogan = "Kotlin is awesome!"
    val sloganLength = slogan.length
    println(sloganLength)  // Output: 17

    /** substring(startIndex, endIndex) **/
    val quote = "Seif Mohamed"
    val subQuote = quote.substring(startIndex = 5, endIndex = 12) // Extracts "power"
    println(subQuote)  // Output: power

    /** take(n) **/
    val greeting = "Good morning!"
    val shortGreeting = greeting.take(4) // Takes the first 4 characters
    println(shortGreeting)  // Output: Good

    /** toUpperCase() and toLowerCase() **/

    val city = "New York"
    val upperCity = city.toUpperCase()
    val lowerCity = city.toLowerCase()
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
    val colors = "red,green,blue"
    val colorList = colors.split(",")
    println(colorList)  // Output: [red, green, blue]


    /** indexOf(string) and lastIndexOf(string) **/
    val sentence = "Kotlin is a powerful language."
    val firstKotlin = sentence.indexOf(string = "Kotlin") // Index of first "Kotlin"
    val lastPowerful = sentence.lastIndexOf(string = "powerful") // Index of last "powerful"
    println(firstKotlin)  // Output: 0
    println(lastPowerful)  // Output: 14


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


}