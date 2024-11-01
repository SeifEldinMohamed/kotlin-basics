
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
    }
    println("also Example:")
    println(answer)
    println("---------------------------")

    /** apply ( is useful for modifying an object) **/
    /** this and return object after modifications **/
    number = 0
    val modifiedNumber = number.apply {// returns the object was called on after modifications
        plus(5)
        minus(2)
    }
    println("apply Example:")
    println(modifiedNumber)
    println("---------------------------")


    /** run ( to perform multiple operations on an object and return a result )  **/
    /** this and return last line **/
    number = 0
    val result = number.run {// returns the object was called on after modifications
        plus(5)
        minus(2)
        println()
    }
    println("run Example:")
    println(result)
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
}