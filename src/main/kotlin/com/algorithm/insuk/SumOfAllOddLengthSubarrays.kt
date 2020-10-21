package com.algorithm.insuk

/**
 *
Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 */

class SumOfAllOddLengthSubarrays {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        (1..(arr.lastIndex + 1)).forEach {
            if (it % 2 != 0) {
                sum = sum.plus(
                        getSumOfSubArrays(arr, it)
                )
            }
        }
        return sum
    }

    /**
     * odd 에 따라 그 odd 일때의 총 sum을 구한다.
     */
    private fun getSumOfSubArrays(arr: IntArray, it: Int): Int {
        var sum = 0
        for (i in 0..(arr.size - it)) {
            for (j in i until i + it) {
                sum = sum.plus(arr[j])
            }
        }
        return sum
    }
}