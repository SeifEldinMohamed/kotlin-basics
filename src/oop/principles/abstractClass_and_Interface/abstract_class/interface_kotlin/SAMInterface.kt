package oop.principles.abstractClass_and_Interface.abstract_class.interface_kotlin

interface IntPredicate {
    fun accept(i: Int): Boolean
}

class UseIntPredicate(): IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}

// functional interface (SAM)
fun interface IntPredicate2 {
    fun accept(i: Int): Boolean
}

fun main() {
    val useIntPredicate = UseIntPredicate()
    println("Is 7 even? - ${useIntPredicate.accept(7)}")

    // Creating an instance of a class using object keyword
    /**
    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }
    **/

// Creating an instance using lambda
    val isEven2 = IntPredicate2 { it % 2 == 0 }
    println("Is 7 even? - ${isEven2.accept(7)}")
}