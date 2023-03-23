package com.example.a4_qa

fun some(data: String?): Int{
    return data!!.length // !! -> null일 경우 강제로 예외 발생
}

fun main(){
    var data: String? = "kkang"
    println("data = $data : ${data?.length?: -1}")
    println("length : ${some(data)}")
    data = null
    println("data = $data: ${data?.length?: -1}") // data가 null일 경우 -1로 반환
}