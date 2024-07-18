//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var items = arrayOf(3, 5, 7, 2, "Zabih", 6.6, "Najeeb")
    println(items[4])
    println(items[6])


    var yearOfBirth = mapOf(
        "Ontario" to ON,
        "Britsh Clombio" to BC,
        "Calgary" to CG,
        "Otawa" to OA
    )
    println(yearOfBirth)
    var namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println(namesAndScores) // > {Anna=2, Brian=2, Craig=8, Donna=6}
}