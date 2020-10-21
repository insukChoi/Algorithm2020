package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SumOfAllOddLengthSubarraysTest {
    @Test
    fun `예제1`() {
        val inputArray = intArrayOf(1,4,2,5,3)
        Assertions.assertEquals(58, SumOfAllOddLengthSubarrays().sumOddLengthSubarrays(inputArray))
    }

    @Test
    fun `예제2`() {
        val inputArray = intArrayOf(1,2)
        Assertions.assertEquals(3, SumOfAllOddLengthSubarrays().sumOddLengthSubarrays(inputArray))
    }

    @Test
    fun `예제3`() {
        val inputArray = intArrayOf(10,11,12)
        Assertions.assertEquals(66, SumOfAllOddLengthSubarrays().sumOddLengthSubarrays(inputArray))
    }
}