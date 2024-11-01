package basics.list

fun main() {
    val fruitsList = listOf("Apple", "Banana", "Orange")
    println(fruitsList)

    val mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(7)
   // mutableNumbers.remove(10)
    // mutableNumbers.remove()
    println(mutableNumbers)

    for (fruit in fruitsList) {
        println(fruit)  // Prints each fruit on a separate line
    }
    // forEach loop: A concise way to iterate and perform an action on each element without needing an index variable
    fruitsList.forEach { it ->
        println(it)
    }

    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    val multiplyByTwo: MutableList<Int> = mutableListOf()
//    for (num in numbers){
//        multiplyByTwo.add(num * 2)
//    }
//    println(multiplyByTwo)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val evenNumbers2 = numbers.filter (predicate = { it % 2 == 0 })
    val transformData = numbers.map { it * 2 }
    println(transformData)  // Output: [2, 4, 6]
   // println(evenNumbers2)  // Output: [2, 4, 6]


    var countries:ArrayList<String>  = ArrayList(9)   // not fixed size  , 9 is just init size
    countries.add("Sudan")
    countries.add("Ethiopia")
    countries.add("Somalia")

    //you can also use helper function to create an array list
    var cities:ArrayList<String>  = arrayListOf("Khartoum" ,"Cairo" ,"Cape Town")


}