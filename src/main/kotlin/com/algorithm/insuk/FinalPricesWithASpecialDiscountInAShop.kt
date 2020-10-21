package com.algorithm.insuk

/* https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/ */
class FinalPricesWithASpecialDiscountInAShop {
    fun finalPrices(prices: IntArray): IntArray {
        val purchaseArray = mutableListOf<Int>()
        for ((index, price) in prices.withIndex()) {
            val nextIndex = getNextIndex(prices, index)
            when {
                nextIndex != NO_USE_INDEX -> {
                    purchaseArray.add(price.minus(prices[nextIndex]))
                }
                else -> {
                    purchaseArray.add(price)
                }
            }
        }
        return purchaseArray.toIntArray()
    }

    /**
     * 할인 받을 수 있는 다음 인덱스를 구한다.
     * @param prices: IntArray
     * @param index: Int
     * @return Int
     */
    private fun getNextIndex(prices: IntArray, index: Int): Int {
        ((index+1) until prices.size).forEach { next ->
            if (prices[index] >= prices[next]) return next
        }
        return NO_USE_INDEX
    }

    companion object {
        // 분기를 끊기 위한 의미 없는 INDEX FLAG
        const val NO_USE_INDEX = -1
    }
}