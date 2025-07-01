package oop.principles.inheritance

// Base Class Vehicle (Parent)
open class Vehicle(
    private val name: String,
    private val color: String,
    private val year: Int,
    private val model: String
) {
     protected val test: String = ""
    open fun printBasicDetails() { // child class can see it but an instance of child or parent class can't see it
        println("Manufacturer: $name")
        println("Color: $color")
        println("Year: $year")
        println("Model: $model")
    }
}

// Derived Class Car ( Child )
open class Car(
    name: String,
    color: String,
    year: Int,
    model: String,
    private val bodyType: String
) : Vehicle(name, color, year, model) {

    override fun printBasicDetails() {
        super.printBasicDetails()
        println("bodyType = $bodyType")
    }
//    fun printBodyType() {
//        printBasicDetails()
//        println("Body Style: $bodyType")
//    }
}

open class Boat(
    name: String,
    color: String,
    year: Int,
    model: String,
    private val numberOfLIfeJacket: Int
) : Vehicle(name, color, year, model) {

}

class ElectricCar(
    name: String,
    color: String,
    year: Int,
    model: String,
    bodyType: String
):Car(name, color, year, model, bodyType){
    fun print() {
        printBasicDetails()
      //  printBodyType()
    }
}

fun main() {
    val elantraSedan:Car = Car("Hyundai", "Red", 2019, "Elantra", "Sedan") // creation of car Object
    elantraSedan.printBasicDetails()
  //  elantraSedan.printBodyType() //calling method to print details
   // elantraSedan.printBodyType() //calling method to print details

     val vType: Vehicle = Car("Hyundai", "Red", 2019, "Elantra", "Sedan") // Type Casting
    vType.printBasicDetails()

//    val vehicles: List<Vehicle> = listOf(
//        Car("Hyundai", "Red", 2019, "Elantra", "Sedan"),
//        Vehicle("Tesla", "Black", 2023, "Model S"),
//    )

//// Iterating over the collection and calling printBasicDetails() on each Vehicle
//    for (vehicle in vehicles) {
//        vehicle.printBasicDetails() // This would work with both Car and Vehicle instances
//    }

}
