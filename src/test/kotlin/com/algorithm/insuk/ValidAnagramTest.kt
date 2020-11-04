package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ValidAnagramTest {
    @Test
    fun `예제1`() {
        val s = "anagram"
        val t = "nagaram"
        assertEquals(true, ValidAnagram().isAnagram(s, t))
    }

    @Test
    fun `예제2`() {
        val s = "rat"
        val t = "car"
        assertEquals(false, ValidAnagram().isAnagram(s, t))
    }

    @Test
    fun `예제3`() {
        val s = "a"
        val t = "ab"
        assertEquals(false, ValidAnagram().isAnagram(s, t))
    }
}