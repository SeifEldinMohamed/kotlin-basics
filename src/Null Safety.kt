fun main() {
    var name1: String = "Vibhor" // Non Nullable String variable
    var name2: String? = null // Nullabe String variable

//    var name3: String = "John Doe"
//    name3 = null // Compilation error

    var nullableName: String? = "John Doe"
    nullableName = null // This is okay

    /** Safe Calls (?.) **/
    println("Safe Calls (?.)")
    val name3: String? = null // Nullabe String variable
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
    val length2 = name3!!.length // This throws NullPointerException if 'name' is 'null'.
    println("length= $length2")

    var myName:String? = null
    myName = "seif"
    if (myName != null)
        println(myName.toString())

}