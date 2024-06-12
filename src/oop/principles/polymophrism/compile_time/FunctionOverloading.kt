package oop.principles.polymophrism.compile_time

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Int, b: Double): Int {
    return (a + b).toInt()
}

fun add(a: Int, b: Int, c:Double): Int {
    return (a + b + c).toInt()
}

//fun add(a: Int, b: Int): Double {
//    return (a + b).toDouble()
//}

fun main() {
    val result1 = add(2, 3)
    val result2 = add(2, 3.5)
    val result3 = add(2, 3, 4.5)
}