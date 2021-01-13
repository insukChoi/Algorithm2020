package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KthSymbolInGrammerTest {

    @Test
    fun `예제1`() {
        assertEquals(0,
                KthSymbolInGrammer().kthGrammar(
                        N = 1,
                        K = 1
                )
        )
    }

    @Test
    fun `예제2`() {
        assertEquals(0,
                KthSymbolInGrammer().kthGrammar(
                        N = 2,
                        K = 1
                )
        )
    }

    @Test
    fun `예제3`() {
        assertEquals(1,
                KthSymbolInGrammer().kthGrammar(
                        N = 2,
                        K = 2
                )
        )
    }

    @Test
    fun `예제4`() {
        assertEquals(1,
                KthSymbolInGrammer().kthGrammar(
                        N = 4,
                        K = 5
                )
        )
    }
}