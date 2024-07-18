fun main() {
    // Exercise 1: Basic Arithmetic Operations
    val x: Double = 5.5
    val y: Double = 3.3

    val sum = x + y
    val difference = x - y
    val product = x * y
    val quotient = x / y

    println("Exercise 1: Basic Arithmetic Operations")
    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println()

    // Exercise 2: Temperature Conversion
    val celsius: Double = 25.0
    val fahrenheit = celsius * 9 / 5 + 32

    println("Exercise 2: Temperature Conversion")
    println("Temperature in Celsius: $celsius")
    println("Temperature in Fahrenheit: $fahrenheit")
    println()

    // Exercise 3: Area of a Circle
    val radius: Double = 7.5
    val pi = 3.14159
    val area = pi * radius * radius

    println("Exercise 3: Area of a Circle")
    println("Radius: $radius")
    println("Area of the circle: $area")
    println()

    // Exercise 4: Simple Interest
    val principal: Double = 1000.0
    val rate: Double = 5.0
    val time: Double = 3.0

    val simpleInterest = (principal * rate * time) / 100

    println("Exercise 4: Simple Interest")
    println("Principal: $principal")
    println("Rate: $rate")
    println("Time: $time")
    println("Simple Interest: $simpleInterest")
    println()

    // Exercise 5: Max of Two Numbers
    val num1 = 10.0
    val num2 = 20.0

    val max = if (num1 > num2) num1 else num2

    println("Exercise 5: Max of Two Numbers")
    println("The maximum of $num1 and $num2 is $max")
    println()

    // Exercise 6: Check Even or Odd
    val number: Int = 15

    println("Exercise 6: Check Even or Odd")
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
    println()

    // Exercise 7: Factorial of a Number
    val num: Int = 5
    var factorial: Long = 1

    for (i in 1..num) {
        factorial *= i
    }

    println("Exercise 7: Factorial of a Number")
    println("Factorial of $num = $factorial")
    println()

    // Exercise 8: Fibonacci Series
    val n: Int = 10
    var first = 0
    var second = 1

    print("Exercise 8: Fibonacci Series\nFirst $n numbers of Fibonacci series: ")

    for (i in 1..n) {
        print("$first ")

        val next = first + second
        first = second
        second = next
    }
    println("\n")


    var numfd1: Double = 5.0

    // Exercise 9: Reverse a String
    val str = "Kotlin"
    val reversedStr = str.reversed()

    println("Exercise 9: Reverse a String")
    println("Original String: $str")
    println("Reversed String: $reversedStr")
    println()

    // Exercise 10: Palindrome Check
    val palindromeStr = "radar"
    val isPalindrome = palindromeStr == palindromeStr.reversed()

    println("Exercise 10: Palindrome Check")
    if (isPalindrome) {
        println("$palindromeStr is a palindrome")
    } else {
        println("$palindromeStr is not a palindrome")
    }

    val bigString = """Hello
        |I love you 
        |Nie
        |Book
    """.trimMargin()
    println(bigString)

    var sum1: Int = 0
    while (sum1 < 10 ){
        sum1 = sum1 +1

        println(sum1)

    }

}