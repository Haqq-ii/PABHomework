package com.example.hw04.task3

enum class CourseStatus { ACTIVE, COMPLETED }
data class Course(val code: String, val name: String, val status: CourseStatus)
fun Course.displayInfo(): String = "$code $name $status"

fun main() {
    val courses = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("PG102", "Game Development", CourseStatus.COMPLETED),
        Course("PAIM103", "Medical Informatics Application Development", CourseStatus.COMPLETED)
    )
    val newCourse = Course("BD104", "Big Data", CourseStatus.ACTIVE)
    courses.add(newCourse)
    courses.removeAt(0)
    println("Daftar Mata Kuliah Tersisa")
    for (course in courses) {
        println(course.displayInfo())
    }
    println()

    val sampleCourse = courses[0]
    val (code, name, status) = sampleCourse

    println("Hasil Destructuring")
    println("Code   : $code")
    println("Name   : $name")
    println("Status : $status")
}