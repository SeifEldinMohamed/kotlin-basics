package oop

// by using a constructor(faster way)
class Car2(
    var brand: String ,
    var model: String,
    var year: Int,
    var color: String
) {
    private var speed: Int = 0

    constructor(brand: String, model: String, year: Int, color: String, speed:Int):this(brand, model, year, color) {
        this.speed = speed
    }

    fun printCarDetails(){
        println("brand = $brand, model = $model, year = $year, color = $color")
        if (speed!=0)
            println("car speed = $speed")
    }
}

// A property is basically a variable that belongs to the class.
//
// the name of a class must be start with an upper case letter.