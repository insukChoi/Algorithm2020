package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DeleteOperationforTwoStringsTest {
    @Test
    fun `예제1`() {
        assertEquals(2,
                DeleteOperationforTwoStrings().minDistance("sea", "eat")
        )
    }

    @Test
    fun `예제2`() {
        assertEquals(4,
                DeleteOperationforTwoStrings().minDistance("sea", "ate")
        )
    }
}