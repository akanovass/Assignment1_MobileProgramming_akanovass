//task1
fun main(){
    val age: Int = 21
    val height: Double = 4.0
    val name: String = "Shyryn"
    val isStudent: Boolean = true

    println("Age $age")
    println("Height $height")
    println("Name $name")
    println("isStudent $isStudent")

    checkNumber()
    printNumbersFor()
    printNumbersWhile()
    listOfNumbers()
}
// Conditional Statements
fun checkNumber(){
    print("Enter the number: ")
    var a = readln().toInt()
    if (a > 0)
        println("$a is positive number")
    else if (a < 0)
        println("$a is negative number")
    else
        println("$a is zero number")
}
// Loops
fun printNumbersFor(){
    println("With 'for' ")
    for (i in 1 .. 10){
        print(" $i" )
    }
    println()
}

fun printNumbersWhile(){
    println("With 'while' ")
    var a = 1
    while (a < 11){
        print(" $a")
        a++
    }
    println()
}
//Collections:
fun listOfNumbers(){
    var listsNums  = listOf(1,2,8,9,55,23,12,22)
    var sum = 0
    for (i in listsNums){
        sum += i
    }
    println("The sum : $sum")
}

