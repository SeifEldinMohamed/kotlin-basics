package basics.null_safety

fun main() {
    var name1: String = "seif" // Non Nullable String variable
    var name2: String? = null // Nullabe String variable

//    var name109: String = "John Doe"
//    name109 = null // Compilation error

    var nullableName: String? = "John Doe"
    nullableName = null // This is okay

    /** Safe Calls (?.) **/
    println("Safe Calls (?.)")
    val name3: String? = null  // Nullabe String variable
    val length = name3?.length // This will return length if name isn't null; otherwise it returns `null`.
    println("length= $length")
    println("/////////////////////////////////////////")

    /** Elvis Operator (?:) **/
    println("Elvis Operator (?:)")
    val lengthOrZero = name3?.length ?: 0 // This will return length if name isn't `null`, otherwise it returns `0`.
    println("length= $lengthOrZero")
    println("/////////////////////////////////////////")

    /** Non-Null Assertion Operator (!!) **/
    println("Non-Null Assertion Operator (!!)")
//    val length2 = name3!!.length // This throws NullPointerException if name3 is 'null'.
//    println("length= $length2")

    var myName:String? = null
   // myName = "seif"
    println(myName?.length ?: myName.toString())

    if (myName != null)
        println(myName.length)
    else
        println(myName.toString())

    println( myName?.length ?: myName.toString())
}