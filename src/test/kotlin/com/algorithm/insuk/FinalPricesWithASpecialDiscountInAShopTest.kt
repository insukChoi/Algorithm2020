package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FinalPricesWithASpecialDiscountInAShopTest {
    @Test
    fun `예제1`() {
        val inputArray = intArrayOf(8,4,6,2,3)
        Assertions.assertArrayEquals(intArrayOf(4,2,4,2,3), FinalPricesWithASpecialDiscountInAShop().finalPrices(inputArray))
    }

    @Test
    fun `예제2`() {
        val inputArray = intArrayOf(1,2,3,4,5)
        Assertions.assertArrayEquals(intArrayOf(1,2,3,4,5), FinalPricesWithASpecialDiscountInAShop().finalPrices(inputArray))
    }

    @Test
    fun `예제3`() {
        val inputArray = intArrayOf(10,1,1,6)
        Assertions.assertArrayEquals(intArrayOf(9,0,1,6), FinalPricesWithASpecialDiscountInAShop().finalPrices(inputArray))
    }
}