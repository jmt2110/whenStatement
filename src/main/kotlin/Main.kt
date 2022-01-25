fun main(args: Array<String>) {
    var num = 5
    println("Please enter a number 1 - 10:")
    num = readLine()!!.toInt()
    var numString = "x"

    when (num) {
        1 -> numString = "Uno"
        2 -> numString = "Dos"
        3 -> numString = "Tres"
        4 -> numString = "Cuatro"
        5 -> numString = "Cinco"
        6 -> numString = "Seis"
        7 -> numString = "Siete"
        8 -> numString = "Ocho"
        9 -> numString = "Nueve"
        10 -> numString = "Diaz"
        !in 1..10 -> numString = "Unknown by this program"
    }

    println("The number " + num + " is " + numString + " in Spanish")
}