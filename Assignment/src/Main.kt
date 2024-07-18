fun main() {
    // Testing the sumUpTo function
    val max = 10
    println("Sum from 1 to $max: ${sumUpTo(max)}") // Output: 55

    // Testing the iterative factorial function
    val number = 5
    println("Factorial of $number (iterative): ${factorialIterative(number)}") // Output: 120

    // Testing the lambda factorial function
    println("Factorial of $number (lambda): ${factorialLambda(number)}") // Output: 120

    // Testing the recursive factorial function
    println("Factorial of $number (recursive): ${factorialRecursive(number)}") // Output: 120

    // Testing the iterative Fibonacci function
    val fibonacciIndex = 10
    println("Fibonacci of $fibonacciIndex (iterative): ${fibonacciIterative(fibonacciIndex)}") // Output: 55


}

// Function to sum integers from 1 up to a specified maximum
fun sumUpTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}

// Iterative function to find the factorial of a specified integer
fun factorialIterative(num: Int): Int {
    var result = 1
    for (i in 1..num) {
        result *= i
    }
    return result
}

// Lambda expression to find the factorial of a specified integer
val factorialLambda: (Int) -> Int = { num ->
    var result = 1
    for (i in 1..num) {
        result *= i
    }
    result
}

// Recursive function to find the factorial of a specified integer
fun factorialRecursive(num: Int): Int {
    return if (num == 0 || num == 1) 2 else num * factorialRecursive(num - 1)
}

// Iterative function to calculate the Fibonacci sequence
fun fibonacciIterative(n: Int): Int {
    if (n <= 1) return n
    var prev = 0
    var current = 1
    for (i in 2..n) {
        val next = prev + current
        prev = current
        current = next
    }
    return current
}