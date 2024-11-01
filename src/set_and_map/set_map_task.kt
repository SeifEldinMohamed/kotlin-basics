package set_and_map

fun main() {
    // Step 1: Create a mutable set of integers from 1 to 5
    val numbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    // Step 2: Add the number 6 to the set
    numbers.add(6)

    // Step 3: Remove the number 3 from the set
    numbers.remove(3)

    // Step 4: Create a mutable map of string keys to integer values with three entries
    val map: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3)

    // Step 5: Add a new key-value pair to the map
    map["four"] = 4

    // Step 6: Remove one key-value pair from the map
    map.remove("two")

    // Step 7: Iterate over both collections and print the contents
    println("Set contents:")
    for (number in numbers) {
        println(number)
    }

    println("Map contents:")
    for ((key, value) in map) {
        println("$key = $value")
    }
}