package oop.principles.abstractClass_and_Interface.abstract_class

abstract class Animal(val name: String) {
    abstract val testAbstract: String
    val test: String = "lskjdf"

    abstract fun sound(): String

    fun info() {
        println("Animal name: $name")
    }
}

class Dog(name: String) : Animal(name) {
    override val testAbstract: String = "test abstract"
    override fun sound() = "Bark"

}

fun main() {
    val dog = Dog("Buddy")
    dog.info()  // Calls the method from the abstract class
    println(dog.sound())  // Calls the overridden method

    // val animal = Animal("test") // Error: Cannot create an instance of an abstract class
}
