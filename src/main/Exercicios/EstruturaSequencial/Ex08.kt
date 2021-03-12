package main.Exercicios.EstruturaSequencial

fun main() {
    print("Work hours: ")
    val workHours = readLine()!!.toInt()

    print("Hourly value: ")
    val hourlyValue = readLine()!!.toInt()

    val value = workHours * hourlyValue

    println("The total value is: $value")
}