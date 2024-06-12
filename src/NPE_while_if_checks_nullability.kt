class MyClass {
    @Volatile //  meaning that writes to this field are immediately made visible to other threads.
    var b: String? = "Kotlin"
    /**
     * Without @Volatile
       Without @Volatile, there's no guarantee that one thread will see the latest value of the variable
       updated by another thread immediately. The updates to the variable might be visible to some threads
       but not others due to CPU caching, compiler optimizations, or instruction reordering.
     **/
}

val myObject = MyClass()

fun main() {
    // Start a thread to change the value of b to null
    Thread {
        Thread.sleep(1.5.toLong()) // Sleep for a short while to ensure the other thread starts first
        myObject.b = null
        println("Thread 1: Changed b to null")
    }.start()

    // Start another thread to read the value of b
    Thread {
        // threadSafeFunction()
        threadSafeFunctionWithLet()
    }.start()
}

fun threadSafeFunction() {
    if (myObject.b != null && myObject.b!!.isNotEmpty()) {
        println("Thread 2: String of length ${myObject.b!!.length}") // This could throw a NullPointerException.
    } else {
        println("Thread 2: Empty string")
    }
}

fun threadSafeFunctionWithLet() {
    myObject.b?.let {
        // Another thread could change myObject.b to null here
        if (it.length > 0) {
            println("String of length ${it.length}")
        } else {
            println("Empty string")
        }
    } ?: println("Empty string")
}
/**
 * Potential Risks Without Synchronization
However, while this approach prevents a NullPointerException within the let block, there are still potential risks when working in a multithreaded environment:

Race Conditions: If you perform more complex operations that involve multiple accesses or modifications to b, race conditions can still occur.
Atomicity: Operations that need to be atomic (e.g., read-modify-write sequences) still require synchronization to ensure correctness.
 **/