package oop.principles.encapsulation

class BankAccount(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0.0) balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount in 5.0..balance) balance -= amount
    }

    fun getBalance() = balance

}

fun main() {
    val currentAccount = BankAccount(100.0)
    currentAccount.deposit(50.0)
    currentAccount.withdraw(30.0)
    println("Balance: ${currentAccount.getBalance()}")
}