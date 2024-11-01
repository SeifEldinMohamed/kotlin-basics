package basics.val_var_boolean_char


const val s = 10 // compile time ( faster )

fun main() {

    val age:Int = 15
    val age2:Float = 10.5F
    val agesSum = age + age2
    println("total age = " + agesSum)

    /** Boolean Values **/

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse)// true
    println(myTrue && myFalse)// false
    println(!myTrue)// false

    /** Boolean Expression **/
    val x = 10
    val y = 9
    println(x > y) // Returns true, because 10 is greater than 9

    println(10 > 9) // Returns true, because 10 is greater than 9

    val ten = 10
    println(ten == 10) // Returns true, because the value of x is equal to 10

    // Char example
    var myChar:Char = 's'
    myChar = '\''
    println(myChar)
    println("lakjsfdhlajf")

}