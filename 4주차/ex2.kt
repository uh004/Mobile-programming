package com.example.a4_qa
// 고차함수 = 매개변수, 반환값을 람다 함수로 반환
fun hofFun(arg: (Int) -> Boolean): () -> String{
    val result = if(arg(10)){
        "valid"
    }
    else{
        "invalid"
    }
    return {"hofFun result : $result"}
}
fun main(){
    val result = hofFun({no -> no > 0})
    println(result())
}