package com.example.hw05.task5

import java.util.Locale
import kotlin.math.roundToInt

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)

fun main() {
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    val total = students.fold(0) { acc, student -> acc + student.score }
    val average = ((total.toDouble() / students.size) * 10.0).roundToInt() / 10.0
    println("Class average: $average")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { s ->
            val status = if (s.score >= 70) "PASS" else "FAIL"
            // PadEnd digunakan agar teks sejajar/rapi
            val paddedName = s.name.padEnd(8)
            val paddedScore = s.score.toString().padEnd(3)
            appendLine("$paddedName $paddedScore $status")
        }
    }
    print(report)
}