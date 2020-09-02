package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class PredictTheWinnerTest {
    @Test
    fun `예제1`() {
        val input = intArrayOf(1,5,2)
        Assertions.assertEquals(false, PredictTheWinner().PredictTheWinner(input))
    }

    @Test
    fun `예제2`() {
        val input = intArrayOf(1,5,233,7)
        Assertions.assertEquals(true, PredictTheWinner().PredictTheWinner(input))
    }
}