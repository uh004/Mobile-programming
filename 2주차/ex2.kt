package com.example.a2_qa

import java.text.SimpleDateFormat
import java.util.*

var data = 10

fun formatDate(date: Date): String {
    val sdformat = SimpleDateFormat("yyyy-MM-dd")
    return sdformat.format(date)
}

class User{
    var name="배수한"
    fun sayHello(){
        println("name : $name")
    }
}

fun main(){
    data=20
    var date = formatDate(Calendar.getInstance().time)
    println(date)

    val user = User()
    user.sayHello()
    println("data : $data")
}