package set_and_map

fun main() {
    // Immutable Set
    val numbers: Set<Int> = setOf(1, 5, 5, 3, 2, 4)

    // Mutable Set
    val mutableNumbers: MutableSet<Int> = mutableSetOf(1, 5,  3, 2, 4)

    println(numbers)

    mutableNumbers.add(6) // mutable set only
    mutableNumbers.remove(3) // mutable set only
    println(mutableNumbers)

    for (number in numbers) {
        println(number)
    }
    println(numbers.contains(2)) // true

}