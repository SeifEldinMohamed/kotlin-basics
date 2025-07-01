package scope_functions

data class Person(var name:String)
data class Manager(val name:String, var age:Int)
fun main() {
     var number: Int? = null

    /** let ( is used to operate on a nullable object only when it's not null. ) **/
    /** it and return last line ( lambda result ) **/

    number = 1
    val y = number?.let {// return what in the last line
        val x = it + 1
        x
    } ?: 3 // use elvis operator as else number is equals to null
    println("Let Example:")
    println(y)
    println("---------------------------")


    /** also ( Perform additional actions while keeping the object unchanged ) **/
    /** it and return object called on **/
    var i: Int = 0
    val answer: Int = (i * i).also { // return the object that was called on
        i++
        println(i)
    }
    println("also Example1:")
    println(answer)
    println("---------------------------")
    println("also Example2:")

    val list = mutableListOf<Int>()

    val result5 = list.also {
        it.add(1)
        it.add(2)
        it.add(3)
    }

    println(result5) // Prints the original list with added elements
    println("---------------------------")

    /** apply ( is useful for modifying an object) **/
    /** this and return object after modifications **/
    val person = Person(name = "")
    val modifiedNumber = person.apply {// returns the object was called on after modifications
        name = "Seif"
    }
    println("apply Example:")
    println(modifiedNumber)
    println("---------------------------")


    /** run ( to perform multiple operations on an object and return a result )  **/
    /** this and return last line **/
    number = 0
    val result = number.run {// returns the object was called on
        plus(5)
        minus(2)
        println()
    }
    println("run Example:")
    println(result)
    println("number = $number")
    println("---------------------------")

    /** with ( same as run but with different signature )  **/
    /** this and return last line **/
    val intNumber = 100
    val withReturn = with(intNumber) {
        plus(10)
        minus(5)
        println()
    }

    println("with Example:")
    println(withReturn)
    println("---------------------------")


    /**
     * interview question
     **/

    var manager = Manager("name", 14)
    // return last line ( won't compile )
    /*
    manager = manager.let {
        it.age = 16
    }
    // return last line ( won't compile )
    manager = manager.run {
        age = 16
    }
    // return last line ( won't compile )
    manager = with(manager) {
        age = 16
    }

     */

    // return object
    manager = manager.apply {
        age = 16
    }
    // return object
    manager = manager.also {
        it.age = 16
    }

}