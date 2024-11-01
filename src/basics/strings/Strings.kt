package basics.strings

fun main() {
    /** Comparing Strings **/
    println("Comparing Strings")
    val txt1 = "Hello World"
    val txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
    println(txt1 == txt2)  // Outputs true (they are equal)
    println("//////////////////////////////////////////////////////")

    /** String Concatenation **/
    println("String Concatenation")
    val firstName = "John"
    val lastName = "Doe"
    println(firstName + " " + lastName)
    println("//////////////////////////////////////////////////////")

    /** String Templates/Interpolation **/
    println("String Templates")
    println("My name is $firstName")
    println("My first name length is ${firstName.length}")
    println("//////////////////////////////////////////////////////")

    val text = """
        My name is Seif
        
        Job: Android software Engineer
    """
    println(text)

}