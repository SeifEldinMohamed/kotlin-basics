package oop

import oop.companion_object.Constants

fun main() {
// Create a FordCar object of the Car class
    val fordCar = Car()

// Access the properties and functions.add some values to it
    fordCar.brand = "Ford"
    fordCar.model = "Mustang"
    fordCar.year = 1969
    fordCar.color = "Black"

    println(fordCar.brand)   // Outputs Ford
    println(fordCar.model)   // Outputs Mustang
    println(fordCar.year)    // Outputs 1969
    println(fordCar.color)    // Outputs Black

    /** By constructor **/
    // A constructor is like a special function, and it is defined by using two parantheses ()
    // after the class name. You can specify the properties inside of the parantheses
    // (like passing parameters into a regular function).
    val mercedesCar = Car2(brand = "Mercedes", model = "C-Class", year = 2024, color = "blue")
    val bmwCar = Car2("BMW", "X5", 1999, "Black", speed = 200)
    mercedesCar.printCarDetails()
    bmwCar.printCarDetails()
    // Tip: When a function is declared inside a class, it is known as a class function, or member function.
    //
    // Note: When an object of the class is created, it has access to all of the class functions.

}
