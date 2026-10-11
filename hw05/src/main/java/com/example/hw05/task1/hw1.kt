package com.example.hw05.task1

fun main() {
    val doubleInt: (Int) -> Int = { it * 2 }
    println(doubleInt(7))
    val startsWithVowel: (String) -> Boolean = {
        val firstChar = it.firstOrNull()?.lowercaseChar()
        firstChar in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    val maxInt: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxInt(12, 7))
}