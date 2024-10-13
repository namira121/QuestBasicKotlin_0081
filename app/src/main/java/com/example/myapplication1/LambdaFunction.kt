package com.example.myapplication1

//Lambda Functions
//Lambda functions adalah fungsi yang tidak memiliki nama
// Lambda functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String) :String {
    return string.uppercase()
}

fun main(){
    uppercaseString("HELLO")
    println({string: String -> string.uppercase()} ("HELLO"))

}