package oop.Enum

// The most basic use case for enum classes is the implementation of type-safe enums:
// Each enum constant is an object. Enum constants are separated by commas.
enum class TrafficLight {
    RED, YELLOW, GREEN
}

// Since each enum is an instance of the enum class, it can be initialized as:
enum class TrafficLight2(val color:String) {
    RED("red"),
    YELLOW("yellow"),
    GREEN("green")
}

// Enum constants can declare their own anonymous classes with their corresponding methods,
// as well as with overriding base methods.
enum class TrafficLight3(val color:String) {
    RED("red"){
        override fun signal(): String {
            return "Stop"
        }

    },
    YELLOW("yellow"){
        override fun signal(): String {
            return "Ready"
        }
    },
    GREEN("green"){
        override fun signal(): String {
            return "Go"
        }
    }; // Expecting ';' after the last enum entry or '}' to close enum class body
    abstract fun signal(): String
}
/**
 Property Declaration	  Modifiable	                    Use Case
    color: String	        Yes	                    Not recommended for enums unless specifically required.
    val color: String	    No (read-only)	        Preferred approach to guarantee immutability of enum values.
  **/

fun main() {
    val trafficLights = listOf<TrafficLight>(
        TrafficLight.GREEN,
        TrafficLight.RED,
        TrafficLight.YELLOW,
        TrafficLight.GREEN,
        )
    for (light in trafficLights){
        when(light){
            TrafficLight.RED -> println("red")
            TrafficLight.YELLOW -> println("yellow")
            TrafficLight.GREEN -> println("green")
        }
    }

    //
    val currentLight = TrafficLight3.RED
    println("The light is ${currentLight.color} and it means ${currentLight.signal()}.")

    for (light in TrafficLight3.values()) {
        println("Light: ${light.color}, Signal: ${light.signal()}")
    }
}