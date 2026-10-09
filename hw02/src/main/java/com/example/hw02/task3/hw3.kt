package com.example.hw02.task3

fun main(){
    val numberOfDays = 5
    for(i in 1..numberOfDays){
        println("Day $i: Study for 20 minutes")
    }
    for(i in 1..numberOfDays step 2){
        println("Day $i: Study for 20 minutes")
    }
}