package oop.principles.inheritance

interface A{
    val test1:String
}
interface B{
    val test2:String
}

class C: A,B{
    override val test1: String = "test1"
    override val test2: String = "test2"
    fun concatenateStrings():String{
        return test1 + test2
    }
}

fun main() {
    val c1 = C()
    println(c1.concatenateStrings())
}
