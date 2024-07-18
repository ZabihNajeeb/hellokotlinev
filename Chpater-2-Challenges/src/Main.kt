//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    val age = 16
    println(age)
    val a: Int =45
    print(a)
    // 1
    val answer1: Int = (46 * 100) + 10
// 2
    val answer2: Int = (46 * 100) + (10 * 100)
// 3
    val answer3: Int = (46 * 100) + (10 / 10)
    println(answer1)
    println(answer2)
    println(answer3)

    var khan = 5 * 3 - 4 / 2 * 2

    println(khan)

    val aa = 10
    val b = 20



}