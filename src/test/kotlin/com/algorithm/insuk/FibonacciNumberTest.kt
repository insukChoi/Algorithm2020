package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FibonacciNumberTest {
    @Test
    fun `예제1`() {
        val input = 2
        assertEquals(1, FibonacciNumber().fib(input))
    }

    @Test
    fun `예제2`() {
        val input = 3
        assertEquals(2, FibonacciNumber().fib(input))
    }

    @Test
    fun `예제3`() {
        val input = 4
        assertEquals(3, FibonacciNumber().fib(input))
    }

    @Test
    fun `예제4`() {
        val input = 1
        assertEquals(1, FibonacciNumber().fib(input))
    }
}