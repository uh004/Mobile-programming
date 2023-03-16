package com.example.a3_qa

open class User(val name: String){
    var age:Int = 0
        set(value){
            if(value < 0){
                println("오류")
                return
            }
            field = value // age를 직접적으로 사용안하고 대리적으로 age로 접근
        }

    constructor(name:String, age:Int) : this(name){
        this.age = age
    }
    open fun someFun(){
        println("name $name")
    }
}

class VIPUser(name:String, age:Int, val level:Int) : User(name,age){
    override fun someFun(){
        println("VIP name $name")
    }
}

fun main(){
    val vip = VIPUser("park", 10, 1)
    vip.someFun()
    println("등급 ${vip.level}")
}