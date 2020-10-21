package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FindCommonCharactersTest {
    @Test
    fun `예제1`() {
        val inputArray = arrayOf("bella","label","roller")
        Assertions.assertEquals(listOf("e", "l", "l"), FindCommonCharacters().commonChars(inputArray))
    }
}