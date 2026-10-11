package com.example.hw04.task1

data class Product(val name: String, val price: Int)

fun Product.isExpensive(): Boolean = price > 500000

fun main() {
    val product1 = Product("Mouse Gaming", 250000)
    val product2 = Product("Monitor 4K", 3500000)

    println("Produk 1: $product1")
    println("Produk 2: $product2")
    println("${product1.name} mahal? ${product1.isExpensive()}")
    val updatedProduct1 = product1.copy(price = 600000)
    println("Produk 1 setelah diupdate: $updatedProduct1")

    println("${updatedProduct1.name} mahal? ${updatedProduct1.isExpensive()}")
}