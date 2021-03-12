package main.Exercicios.EstruturaSequencial

fun main() {
    print("Enter a temperatue in Celcius: ")
    val tempCelc = readLine()!!.toDouble()

    val tempFahr = (9 / 5) * (tempCelc + 32)

    println("${tempCelc}Cº to Fahrenheit is: ${tempFahr}Fº")
}