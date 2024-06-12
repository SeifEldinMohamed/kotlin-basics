package oop.extension_functions

fun String.reverseWords(): String {
    return this.split(" ").reversed().joinToString(" ")
}

fun main() {
    val sentence = "Kotlin is a powerful language"
    println(sentence.reverseWords())  // Output: "language powerful a is Kotlin"

    val singleWord = "Hello"
    println(singleWord.reverseWords())  // Output: "Hello"

    val emptyString = ""
    println(emptyString.reverseWords())  // Output: ""
}