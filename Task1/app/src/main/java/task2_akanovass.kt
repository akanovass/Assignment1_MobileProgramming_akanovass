    fun main(){
            val person = Person("Shyryn Akan", 21, "akanovass@kbtu.kz")
            person.displayInfo()
            //inherits from Person
            val employee = Employee("Yermakhan Serikov", 22, "yermakhan@kbtu.kz", 3980.0)
            employee.displayInfo()

            val account = BankAccount(1000.0)
            account.deposit(500.0)   // Deposit: 500
            account.withdraw(300.0)  // Withdraw: 300
            account.withdraw(1500.0) // Attempt to withdraw more than the balance
    }

    open class Person(val name: String, val age: Int, val email: String) {
        open fun displayInfo() {
            println("Name: $name, Age: $age, Email: $email")
        }
    }


    class Employee(name: String, age: Int, email: String, val salary: Double): Person(name, age, email) {
        override fun displayInfo() {
            super.displayInfo()
            println("Salary: $$salary")
        }
    }


    class BankAccount(private var balance: Double) {
        fun deposit(amount: Double) {
            if (amount > 0) {
                balance += amount
                println("Deposited: $$amount, New Balance: $$balance")
            }
        }

        fun withdraw(amount: Double) {
            if (amount > 0 && balance >= amount) {
                balance -= amount
                println("Withdrew: $$amount, New Balance: $$balance")
            } else {
                println("Insufficient funds")
            }
        }
    }

