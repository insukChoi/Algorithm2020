package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LargestSubstringBetweenTwoEqualCharactersTest {
    @Test
    fun `예제1`() {
        val s = "aa"
        Assertions.assertEquals(0, LargestSubstringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters(s))
    }

    @Test
    fun `예제2`() {
        val s = "abca"
        Assertions.assertEquals(2, LargestSubstringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters(s))
    }

    @Test
    fun `예제3`() {
        val s = "cbzxy"
        Assertions.assertEquals(-1, LargestSubstringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters(s))
    }

    @Test
    fun `예제4`() {
        val s = "cabbac"
        Assertions.assertEquals(4, LargestSubstringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters(s))
    }
}