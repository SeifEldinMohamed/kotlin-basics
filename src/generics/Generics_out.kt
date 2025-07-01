package generics

//class Box<out T>(private val item: T) {
//    fun getItem(): T = item // Allowed ( only retrieve the item )
//    // fun setItem(newItem: T) = // Not allowed
//}

class Box<in T> {
    fun putItem(item: T) {
        println("Putting item into the box: ${item.toString()}")
    }
}

open class Book(val title: String)
class FictionBook(title: String, val genre: String) : Book(title)

fun main() {
    /**
    val fictionBox: Box<FictionBook> = Box(FictionBook("1984", "Dystopian"))
    val bookBox: Box<Book> = fictionBox // Covariance (out) : FictionBook -> Book
    // This means you can treat a container of a subtype (FictionBook) as a container of its supertype (Book).
    // Since Box<out T> only produces (outputs) items, treating a Box<FictionBook> as a Box<Book> is safe:
    println(bookBox.getItem().title) // Prints: 1984
    **/
    val bookBox: Box<Book> = Box<Book>()
    val fictionBox: Box<FictionBook> = bookBox // Contravariance: Book -> FictionBook

    fictionBox.putItem(FictionBook("1984", "Dystopian")) // Allowed
   // fictionBox.putItem(Book("General Book")) // Allowed because Box<Book> can accept any Book
}