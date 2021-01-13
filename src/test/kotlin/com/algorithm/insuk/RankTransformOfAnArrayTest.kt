package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RankTransformOfAnArrayTest {
    @Test
    fun `예제1`() {
        val input = intArrayOf(40, 10, 20, 30)
        assertArrayEquals(intArrayOf(4, 1, 2, 3),
                RankTransformOfAnArray().arrayRankTransform(input)
        )
    }

    @Test
    fun `예제2`() {
        val input = intArrayOf(100, 100, 100)
        assertArrayEquals(intArrayOf(1, 1, 1),
                RankTransformOfAnArray().arrayRankTransform(input)
        )
    }

    @Test
    fun `예제3`() {
        val input = intArrayOf(37, 12, 28, 9, 100, 56, 80, 5, 12)
        assertArrayEquals(intArrayOf(5, 3, 4, 2, 8, 6, 7, 1, 3),
                RankTransformOfAnArray().arrayRankTransform(input)
        )
    }
}