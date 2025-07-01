package basics.loops

fun main() {
    /** While**/
    println("While:")
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
    println("///////////////////////////////////////")

    /** Do While **/
    println("Do While:")
    var i2 = 0
    do {
        println(i2)
        i2++
    }
    while (i2 < 5)
    println("///////////////////////////////////////")

    /** For **/
    println("For:")
    for(i in 0..10) { // create ranges of values with ".."
        println(i)
    }

    // for (i in 1..100) { ... }  // closed-ended range: includes 100
    // for (i in 1 until 100) { } // open-ended range: does not include 100
    // for (x in 2..10 step 2) { println(x) }
    // for (x in 10 downTo 1) { println(x) }
   // (1..10).forEach { println(it) }
    
    println("///////////////////////////////////////")

    /** Break **/
    println("Break:")

    var j = 0
    while (j < 10) {
        j++
        println(j)
        if (j == 4) {
            break
        }
    }
    println("///////////////////////////////////////")

    /** Continue **/
    println("Continue:")

    var k = 0
    while (k < 10) { 
        if (k == 4) {
            k++
            continue
        }
        println(k)
        k++
    }
}