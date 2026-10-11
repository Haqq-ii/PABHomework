package com.example.hw05.task2
fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}
fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.forEach { if (condition(it)) println(it) }
}
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    val doubleInt: (Int) -> Int = { it * 2 }
    println(applyTwice(3, doubleInt)) // Expected: 12

    val startsWithVowel: (String) -> Boolean = {
        it.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    val courses = listOf("Algebra", "English", "History", "Calculus", "Art")
    printIf(courses, startsWithVowel)

    val numbers = listOf(2, 3, 4)
    println(transform(numbers) { (it * it).toString() })
}