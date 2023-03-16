package com.example.a2_qa

fun main(){
    // list...............
    var list = listOf<Int>(10,20,30)
    println(list.get(0)) // 10

    var list2 = mutableListOf<Int>(10,20,30)
    println(list2.get(1)) // 20
    list2.set(1, 30) // 첫번째 인덱스 값을 30으로 변경
    println(list2.get(1))  // 30
}