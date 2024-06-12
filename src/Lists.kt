fun main() {
    val fruitsList = listOf("Apple", "Banana", "Orange")
    val mutableNumbers = mutableListOf(1, 2, 3)
    println(fruitsList)
    println(mutableNumbers)

    for (fruit in fruitsList) {
        println(fruit)  // Prints each fruit on a separate line
    }
    // forEach loop: A concise way to iterate and perform an action on each element without needing an index variable
    fruitsList.forEach {
        println(it)
    }

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val evenNumbers2 = numbers.filter (predicate = { it % 2 == 0 })
    println(evenNumbers)  // Output: [2, 4, 6]
    println(evenNumbers2)  // Output: [2, 4, 6]

}