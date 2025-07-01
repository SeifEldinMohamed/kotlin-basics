package oop.principles.abstractClass_and_Interface.abstract_class.interface_kotlin

interface Movable {
    val test:String // abstract by default
    /// val test2:String = "" // Error: Property initializers are not allowed in interfaces
    fun move() // abstract by default
}

interface Flyable {
    fun fly() { // not abstract, open by default
        println("Flying high")
    }
}

class Bird : Movable, Flyable {
    override val test: String = "test"

    override fun move() {
        println("Bird is moving")
    }
}

fun main() {
    val bird = Bird()
    bird.move()  // Calls the method from the Movable interface
    bird.fly()  // Calls the default method from the Flyable interface
}