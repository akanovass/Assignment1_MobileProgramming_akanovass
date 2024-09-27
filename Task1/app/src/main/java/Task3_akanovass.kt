fun main() {
    println("Enter 2 number: ")
    var num1 : Int = readln().toInt()
    var num2 : Int = readln().toInt()
    println("Number 1 is: ${num1}")
    println("Number 2 is: ${num2}")

    // Basic Function: Sum of two integers
    val sumResult = sum(num1, num2)
    println("Sum of $num1 and $num2: $sumResult")

    // Lambda Function: Multiply two numbers
    val multiplyLambda: (Int, Int) -> Int = { a, b -> a * b }
    val multiplyResult = multiplyLambda(num2, num1)
    println("Multiplication of $num1 and $num2 : $multiplyResult")

    // Higher-Order Function: Apply a lambda to two integers
    val resultOfHigher = applyOperation(num1, num2, multiplyLambda)
    println("Result of applying lambda to $num1 and $num2: $resultOfHigher")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
