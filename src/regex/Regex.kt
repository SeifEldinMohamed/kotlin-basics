package regex

fun main() {
    val email = "example@example.com"
    println("Is valid email: ${isValidEmail(email)}")
}

fun isValidEmail(email: String): Boolean {
    val emailRegex = "^[\\w._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$".toRegex()
    return emailRegex.matches(email)
}