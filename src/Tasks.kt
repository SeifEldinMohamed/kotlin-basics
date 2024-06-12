fun main() {
    /** loops **/
    // Print even numbers from 0 -> 15 and count of them using while and for loops.
    var count = 0
    for (i in 0..15){
        if (i % 2 == 0){
            println(i)
            count++
        }
    }
    println("count = $count")

    var count2 = 0
    for (i in 0..15 step 2){
        println(i)
        count2++
    }
    println("count2 = $count2")

    /** Break **/
    // Finding the First Even Number from 1 -> 10
    for (number in 1 .. 10) {
        if (number % 2 == 0) {
            println("$number is the first even number found!")
            break
        }
    }

    /** Continue **/
    for (number in 0..10) {
        if (number % 2 == 0) {
            continue  // Skip to the next iteration if the number is even
        }
        println(number)
    }


}