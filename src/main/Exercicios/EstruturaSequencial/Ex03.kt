package main.Exercicios.EstruturaSequencial

fun main() {
    println("Enter a number: ")
    val number1 = readLine()!!.toInt()

    println("Enter a other number: ")
    val number2 = readLine()!!.toInt()

    val sum = number1 + number2

    println("The sum is: $sum")
}