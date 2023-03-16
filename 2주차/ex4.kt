package com.example.a2_qa

fun main(){
    fun some(data1: Int, data2: Int = 10): Int{
        return data1 + data2
    }
    println(some(10))
    println(some(10,20))
    println(some(data2 = 20, data1 = 10))
}