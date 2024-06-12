package oop.data_class

// Step 1: Define the Data Class
data class Book(val title: String, val author: String, val year: Int, val isbn: String)

// Step 2: Use the Data Class
fun main() {
    val book1 = Book("1984", "George Orwell", 1949, "1234567890")
    val book2 = Book("Brave New World", "Aldous Huxley", 1932, "0987654321")
    val book3 = Book("1984", "George Orwell", 1949, "1234567890")

    // toString()
    println(book1)  // Output: Book(title=1984, author=George Orwell, year=1949, isbn=1234567890)

    // equals() and hashCode()
    println(book1 == book2)  // Output: false
    println(book1 == book3)  // Output: true

    // copy()
    val book4 = book1.copy(year = 1950)
    println(book4)  // Output: Book(title=1984, author=George Orwell, year=1950, isbn=1234567890)

    // Destructuring
    val (title, author, year, isbn) = book1
    println("Title: $title, Author: $author, Year: $year, ISBN: $isbn")
    // Output: Title: 1984, Author: George Orwell, Year: 1949, ISBN: 1234567890
}