package com.example.hw03.task4
open class SmartDevice(val name: String)

fun showInfo(data: Any) {
    when (data) {
        is String -> println(data.length)
        is Int -> println(data * 2)
        is SmartDevice -> println(data.name)
        else -> println("Unknown")
    }
}

fun main() {
    showInfo("Kotlin")
    showInfo(10)
    showInfo(true)

    val myDevice = SmartDevice("My Smart Speaker")
     showInfo(myDevice)
}