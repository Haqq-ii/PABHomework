package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)

fun main() {
    val passedCount = students.filter { it.score >= 70 }.count()
    println("Passed count: $passedCount")
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }
    println("Top 3 students:")
    students.sortedByDescending { it.score }
        .take(3)
        .forEach { println(it.name) }
    val total = students.fold(0) { acc, student -> acc + student.score }
    val average = total.toDouble() / students.size
    println("Total: $total   Average: $average")

    val groupedByYear = students.groupBy { it.year }
    groupedByYear.forEach { (year, studentList) ->
        val names = studentList.map { it.name }
        println("$year: $names")
    }
}