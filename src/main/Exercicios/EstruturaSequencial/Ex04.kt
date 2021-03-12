package main.Exercicios.EstruturaSequencial

fun main() {
    println("Enter a 1º value: ")
    val value1 = readLine()!!.toInt()

    println("Enter a 2º value: ")
    val value2 = readLine()!!.toInt()

    println("Enter a 3º value: ")
    val value3 = readLine()!!.toInt()

    println("Enter a 4º value: ")
    val value4 = readLine()!!.toInt()

    val average = (value1 + value2 + value3 + value4) / 4

    println("The average is: $average")
}