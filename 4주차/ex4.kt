package com.example.a4_qa

class Student{
    var name: String = "park"
    var sno: Int = 0
}

fun main(){
    val student1 = Student()
    student1.name = "lee"
    student1.sno = 20232020
    println("name : ${student1.name} sno : ${student1.sno}")

    val student2 = Student()
    with(student2){
        name = "kim"
        sno = 20232021
        println("name : ${name} sno : ${sno}")
    }
}