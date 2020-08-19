package com.algorithm.insuk

import kotlin.math.pow

/*
 *
 * https://leetcode.com/problems/count-numbers-with-unique-digits/
 *
Input: 2
Output: 91
Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100,
             excluding 11,22,33,44,55,66,77,88,99
 */
class CountNumbersWithUniqueDigits {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        val to = 10.toDouble().pow(n.toDouble())

        val numberList = mutableListOf<Int>()
        (0 until to.toInt()).forEach {
            if (!checkDuplicatedNumber(it)) {
                numberList.add(it)
            }
        }

        return numberList.size
    }

    private fun checkDuplicatedNumber(num: Int): Boolean {
        val charArray = mutableListOf<Char>()
        num.toString().toCharArray().forEach {
            if (charArray.contains(it)) {
                return true
            } else {
                charArray.add(it)
            }
        }
        return false
    }
}