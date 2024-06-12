package oop.principles.polymophrism.run_time

open class Vehicle {
    open fun startEngine() {
        println("Vehicle engine starts")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine starts")
    }
}

fun main() {
    val myVehicle: Vehicle = Car()
    myVehicle.startEngine() // Output: Car engine starts
}

// final: ( defualt in functions ): can't be overridden
// open: The function can be overridden.