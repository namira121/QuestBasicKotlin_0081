package com.example.myapplication1

// Conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement(){
println("=== Conditional Expression ===")

    //If-Else
    val number = 10
    if (number > 0){
        println("Positive Number")
    }else{
        println("Negative Number")
    }
    println()

    //When
    val day = 1
    when(day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }
    println()

    //Try-Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    }catch (e: NumberFormatException){
        println("Invalid Number")
    }
    println()
}
fun Perulangan(){
println()
    println("=== Perulangan ===")

    for (i in 1..5){
        println("Perulanan ke-$i")
    }
    println()

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars){
        println("Car type: $car")
    }
    println()

    var x = 1
    while (x<=5){
        println("Perulangan ke-$x")
        x++
    }
    println()

    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while(y<=5)
    println()
}

fun main(){
    ConditionalStatement()
    Perulangan()
}