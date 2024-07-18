fun calculateMileage(kilometers: Double, liters: Double): Double {
    if (kilometers <= 0 || liters < 0) {
        throw IllegalArgumentException("Kilometers must be greater than zero and liters must be non-negative.")
    }
    return (liters / kilometers) * 100
}

fun main() {
    val kilometersTravelled = 500.0
    val litersUsed = 25.0

    try {
        val mileage = calculateMileage(kilometersTravelled, litersUsed)
        println("Mileage: %.2f liters per 100km".format(mileage))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()
    println(decimal)

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
   // val totalCost: Double = hourlyRate * hoursWorked.toDouble()
    val totalCost: Double = hourlyRate * hoursWorked
    println(totalCost)

    main1()


}
fun main1() {
    // Create a constant called coordinates and assign a pair containing two and three to it
    val coordinates = Pair(2, 3)

    // Extract the values 2 and 3 from coordinates into two variables called row and column
    val (row, column) = coordinates

    // Print the values to verify
    println("Row: $row, Column: $column")
}
var result2: Int? = 20
var mustHaveresult = result2
println(mustHaveResult +1 )
