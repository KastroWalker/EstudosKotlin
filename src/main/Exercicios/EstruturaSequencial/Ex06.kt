package main.Exercicios.EstruturaSequencial

import kotlin.math.PI

fun main() {
    print("Enter a radius: ")
    val radius = readLine()!!.toInt()

    val area = radius * PI

    println("The area is: $area")
}
