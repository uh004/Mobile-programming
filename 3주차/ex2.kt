package com.example.a3_qa

fun main(){
    var data3 = arrayOf(10,20,30)

    for(i in 0..data3.size - 1){ // 0 1 2
        println(data3[i]) // 10 20 30
    }

    for(i in data3){
        println(i) // 10 20 30
    }

    for((index, value) in data3.withIndex()){// 0,1,2 10,20,30
        print(value) // 10 20 30
        if(index != data3.size - 1){ // 0 1 2  2
            print(", ") // 인덱스가 마지막과 만나게되면 ,(콤마)가 실행되지 않는다.
        }
    }
}