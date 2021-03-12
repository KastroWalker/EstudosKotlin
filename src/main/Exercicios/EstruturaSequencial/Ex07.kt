package main.Exercicios.EstruturaSequencial

fun main() {
    print("Enter a side: ")
    val side = readLine()!!.toInt()

    val area = side * side

    println("The area is $area")
    println("Double the area is ${area * 2}")
}