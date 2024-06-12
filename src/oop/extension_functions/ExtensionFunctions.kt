package oop.extension_functions

fun String.isValidEmail(): Boolean {
    return this.contains("@") && this.contains(".")
}

fun main() {
    val email = "example@example.com"
    println(email.isValidEmail())  // Output: true

    val invalidEmail = "example.com"
    println(invalidEmail.isValidEmail())  // Output: false
}