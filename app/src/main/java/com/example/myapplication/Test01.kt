package com.example.myapplication

fun main () {
    helloWorld()
    println(add(1,2))
}

fun helloWorld() : Unit {
    return println("This is first Practice")
}

fun add(a : Int , b : Int) : Int {
    return a + b
}

fun test01(){
    val a = 1 // 상수 값
    var b = 1 // 변수 값
}