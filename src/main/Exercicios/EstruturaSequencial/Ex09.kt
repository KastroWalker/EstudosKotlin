package main.Exercicios.EstruturaSequencial

fun main() {
    print("Enter a temperatue in Fahrenheit: ")
    val tempFahr = readLine()!!.toDouble()

    val tempCelc = 5 * ((tempFahr - 32) / 9)

    println("${tempFahr}Fº to Celcius is: ${tempCelc}Cº")
}