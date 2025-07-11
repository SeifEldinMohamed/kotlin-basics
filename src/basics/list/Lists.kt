package basics.list

fun main() {
    val fruitsList = listOf("Apple", "Banana", "Orange")
    println(fruitsList)

    val mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(7)
   // mutableNumbers.remove(10)
   //  mutableNumbers.removeAt(index = 0)
    println(mutableNumbers)

    for (fruit in fruitsList) {
        println(fruit)  // Prints each fruit on a separate line
    }
    // forEach loop: A concise way to iterate and perform an action on each element without needing an index variable
    fruitsList.forEach { fruit ->
        println(fruit)
    }

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val multiplyByTwo: MutableList<Int> = mutableListOf()
    for (num in numbers){
        multiplyByTwo.add(num * 2)
    }
    println(multiplyByTwo)

    val transformData = numbers.map { it * 2 }
   // val transformData = numbers.map { it.toFloat() }
    println(transformData)  // Output: [2, 4, 6, 8, 10, 12]

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val evenNumbers2 = numbers.filter (predicate = { it % 2 == 0 })
    println(evenNumbers)  // Output: [2, 4, 6]


    var countries:ArrayList<String>  = ArrayList(3)   // not fixed size  , 9 is just init size
    countries.add("Sudan")
    countries.add("Ethiopia")
    countries.add("Somalia")
    countries.add("Somalia")

    println(countries)
    //you can also use helper function to create an array list
    var cities:ArrayList<String>  = arrayListOf("Khartoum" ,"Cairo" ,"Cape Town")


}
