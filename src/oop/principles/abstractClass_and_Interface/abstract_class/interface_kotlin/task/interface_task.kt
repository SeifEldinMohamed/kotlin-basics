package oop.principles.abstractClass_and_Interface.abstract_class.interface_kotlin.task

// Define the Pet interface
interface Pet {
    // Method play to be implemented by classes
    fun play()
}

// Define the abstract class Animal
abstract class Animal {
    // Abstract method makeSound to be implemented by subclasses
    abstract fun makeSound()
}

// Define the Cat class that inherits from Animal
class Cat : Animal(), Pet{
    // Implement the makeSound method
    override fun makeSound() {
        println("Meow")
    }
    override fun play() {
        println("The cat is playing with a toy.")
    }
}

// Define the Dog class that inherits from Animal
class Dog : Animal(), Pet {
    // Implement the makeSound method
    override fun makeSound() {
        println("Bark")
    }
    override fun play() {
        println("The dog is playing fetch.")
    }
}



// Main function to demonstrate the usage
fun main() {
    val myCat = Cat()
    myCat.makeSound()  // Output: Meow
    myCat.play()       // Output: The cat is playing wit

    val myDog = Dog()
    myDog.makeSound()  // Output: Bark
    myDog.play()       // Output: The dog is playing fetch.
}