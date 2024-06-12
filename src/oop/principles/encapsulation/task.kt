package oop.principles.encapsulation

class Person {
    private var firstName:String = ""
    private var lastName:String = ""

    fun setFirstName(fName:String) {
        this.firstName = fName
    }
    fun setLastName(lName:String) {
        this.lastName = lName
    }
    fun getFirstName() = firstName
    fun getLastName() = lastName
}

fun main() {
    val person1 = Person()
    person1.setFirstName(fName = "SEif")
    person1.setLastName(lName = "Mohamed")
    println("FirstName = ${person1.getFirstName()}")
    println("LastName = ${person1.getLastName()}")
}