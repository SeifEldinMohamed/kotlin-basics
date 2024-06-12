package multithreading

class BankAccount {
    var balance: Int = 1000
}

val account = BankAccount()

fun main() {
    val thread1 = Thread {
        for (i in 1..1000) {
           // synchronized(account) {
                account.balance += 1
           //}
        }
        println("Thread 1: Finished incrementing balance")
    }

    val thread2 = Thread {
        for (i in 1..1000) {
           // synchronized(account) {
                account.balance += 1
           // }
        }
        println("Thread 2: Finished incrementing balance")
    }

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    /**
    The thread1.join() function in Kotlin (and in other programming languages that support threading, like Java)
    is used to pause the execution of the current thread until the thread on which join() is called has completed
    its execution. This is crucial in scenarios where you need to ensure that certain threads have finished their
    work before continuing with further operations in the main thread or other threads.
    **/

    println("Final balance: ${account.balance}")
}

/**
A race condition occurs when multiple threads or processes access shared data and try to change it simultaneously. The outcome of the operations can vary depending on the timing of the accesses, leading to inconsistent or erroneous results. Race conditions are a common problem in concurrent programming.

How a Race Condition Happens
Race conditions occur when two or more threads or processes execute critical sections of code that manipulate shared data. Because these operations are not atomic, the order and timing of the execution can lead to unexpected results. Here's a simple example to illustrate this:

Possible Issue
Due to the race condition, the actual result might be less than 3000. This happens because the operations account.balance += 1 are not atomic. Here’s how a race condition might occur in this example:

Thread 1 reads the balance (1000).
Thread 2 reads the balance (1000).
Thread 1 adds 1 to the balance and writes back (1001).
Thread 2 adds 1 to the balance and writes back (1001).
Even though both threads performed their operations, the final balance after these two operations is 1001 instead of 1002. This is because the operations overlapped in such a way that one thread's update was overwritten by the other.

Preventing Race Conditions
To prevent race conditions, you can use synchronization mechanisms to ensure that only one thread can access the critical section of code at a time.
 **/