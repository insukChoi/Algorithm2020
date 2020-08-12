package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    fun `예제1`() {
        val s = "abcabcbb"
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters().subStringNoDuplicateCnt(s))
    }

    @Test
    fun `예제2`() {
        val s = "pwwkew"
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters().subStringNoDuplicateCnt(s))
    }

    @Test
    fun `예제3`() {
        val s = "bbbb"
        Assertions.assertEquals(1, LongestSubstringWithoutRepeatingCharacters().subStringNoDuplicateCnt(s))
    }

    @Test
    fun `예제4`() {
        val s = "abcabcdbb"
        Assertions.assertEquals(4, LongestSubstringWithoutRepeatingCharacters().subStringNoDuplicateCnt(s))
    }

    @Test
    fun `예제5`() {
        val s = "dvdf"
        Assertions.assertEquals(3, LongestSubstringWithoutRepeatingCharacters().subStringNoDuplicateCnt(s))
    }
}