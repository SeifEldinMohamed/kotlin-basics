package oop.principles.polymophrism.compile_time

data class Point(private val x: Int, private val y: Int) {
    operator fun plus(secondPoint: Point): Point {
        return Point(this.x + secondPoint.x, this.y + secondPoint.y)
    }

}

fun main() {
    val point1 = Point(1, 2)
    val point2 = Point(3, 4)
    val point3 = point1.plus(point2) // Uses the overloaded `plus` operator
    println(point3) // Output: Point(x=4, y=6)
}