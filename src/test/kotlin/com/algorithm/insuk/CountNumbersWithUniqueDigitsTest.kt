package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CountNumbersWithUniqueDigitsTest {
    @Test
    fun `예제1`() {
        val input = 3
        Assertions.assertEquals(739, CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(input))
    }

    @Test
    fun `예제2`() {
        val input = 0
        Assertions.assertEquals(1, CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(input))
    }

    @Test
    fun `예제3`() {
        val input = 1
        Assertions.assertEquals(10, CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(input))
    }
}