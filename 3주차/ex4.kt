package com.example.a3_qa

open class Super{
    fun test(){
        println("super test")
    }

    open fun test1(){
        println("super test1")
    }
}

fun main(){
    val sub = object: Super(){
        var test: String = "sub test var"

        fun test2(){
            println("sub test2")
        }

        override fun test1(){
            println("sub test1")
        }
    }

    sub.test()
    sub.test1()
    println(sub.test)
    sub.test2()
}