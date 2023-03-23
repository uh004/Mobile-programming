package com.example.a4_qa

fun main(){
    { no: Int -> println(no) }(10)

    val some1: (Int) -> Unit = {no -> println(no)}
    val some2: (Int) -> Unit = {println(it)}
    val some3 = { no1: Int, no2:Int ->
        println("in lamda function...")
        no1 * no2
    }

    some1(20)
    some2(30)

    var result = some3(7,9)
    println(result)
}