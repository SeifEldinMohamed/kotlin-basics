package oop.data_class

data class Person(val name: String, val age: Int){
    fun isOldOrYoung():String{
       return if (age < 30){
            "Young"
        } else {
            "Old"
       }
    }
}

class PersonNormal(val name:String, val age: Int) {
    fun isOldOrYoung():String{
        return if (age < 30){
            "Young"
        } else {
            "Old"
        }
    }
}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", 30)
    val person3 = Person("Alice", 25)

    println(person1.isOldOrYoung())

    // toString()
    println(person1)  // Output: Person(name=Alice, age=25)
    // normal class
    val personNormal = PersonNormal("Alice", 25)
    println(personNormal)  // Output:

    // equals() and hashCode()
    println(person1 == person2)  // Output: false
    println(person1 == person3)  // Output: true


    // copy()
    val person4 = person1.copy(age = 26)
    println(person4)  // Output: Person(name=Alice, age=26)
    println(person1)  // Output: Person(name=Alice, age=25)

////////////////////////////////////////////////////////////////////////////////////////
    // Destructuring declaration
    val (name, age) = person1
    println("Name: $name, Age: $age")  // Output: Name: Alice, Age: 25

    // Accessing properties using component functions
    val name2 = person1.component1() // Accesses name property
    val age2 = person1.component2() // Accesses age property
    person1.name

    println("Name: $name2, Age: $age2")

}