package generics

//class EmptyBox<T>(val content: T) {
//    fun getContent(): T {
//        return content
//    }
//}
//
//fun <T> printList(items: List<T>) {
//    for (item in items) {
//        println(item)
//    }
//}
//
//class Container<T>(val value: T)
//
//
//fun scope_functions.main() {
//    // Generic Class
//    val intBox = EmptyBox(10)
//    val stringBox = EmptyBox("Hello")
//    println(intBox.getContent()) // Output: 10
//    println(stringBox.getContent()) // Output: Hello
//
//    //  You may need a function that can print the contents of any list, regardless of the type of elements it holds.
//    //  Instead of writing separate functions for lists of integers, strings, etc., you can write a single generic function.
//    val intList = listOf(1, 2, 3)
//    val stringList = listOf("a", "b", "c")
//    printList(intList) // Output: 1, 2, 3
//    printList(stringList) // Output: a, b, c
//
//    /** InVariance **/
//    val stringContainer: Container<String> = Container("Hello")
//  //  val anyContainer: Container<Any> = stringContainer // Error: Type mismatch
//    // Container<String> is not considered a subtype of Container<Any>, demonstrating Kotlin's invariance by default.
//    val anyContainerCorrect: Container<Any> = Container<Any>("Hello")
//    println(anyContainerCorrect.value) // Output: Hello
//}