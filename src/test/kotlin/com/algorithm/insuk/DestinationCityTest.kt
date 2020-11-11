package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DestinationCityTest {
    @Test
    fun `예제1`() {
        val input = listOf(
                listOf("London", "New York"),
                listOf("New York", "Lima"),
                listOf("Lima", "Sao Paulo")
        )
        assertEquals("Sao Paulo", DestinationCity().destCity(input))
    }

    @Test
    fun `예제1-5`() {
        val input = listOf(
                listOf("London", "New York"),
                listOf("Lima", "Sao Paulo"),
                listOf("New York", "Lima")
        )
        assertEquals("Sao Paulo", DestinationCity().destCity(input))
    }

    @Test
    fun `예제2`() {
        val input = listOf(
                listOf("B", "C"),
                listOf("D", "B"),
                listOf("C", "A")
        )
        assertEquals("A", DestinationCity().destCity(input))
    }

    @Test
    fun `예제3`() {
        val input = listOf(
                listOf("A", "Z")
        )
        assertEquals("Z", DestinationCity().destCity(input))
    }
}