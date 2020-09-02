package com.algorithm.insuk

import com.algorithm.insuk.PredictTheWinner.Type.FIRST
import com.algorithm.insuk.PredictTheWinner.Type.LAST

/*
 * [1, 5, 233, 7]
 * 정답은 p1 이길려면 ?
 * 무조건 p2 가 제일큰수를 못고르게 하면 된다.
 * specialSett = [5, 233, 7]
 */

/*
 * https://leetcode.com/problems/predict-the-winner/
 */
class PredictTheWinner {
    fun PredictTheWinner(nums: IntArray): Boolean {
        if(nums.size < 3) return true

        // 제일 큰 숫자를 찾아 그 친구의 앞뒤 친구를 붙여서 하나의 set 을 만든다.
        val maxNumIndex = nums.indexOf(nums.max()!!)
        val specialSett = intArrayOf(nums[maxNumIndex -1], nums[maxNumIndex], nums[maxNumIndex + 1])

        return findSpecialSett(specialSett, nums.toList(), FIRST) ||
                findSpecialSett(specialSett, nums.toList(), LAST)
    }

    private fun findSpecialSett(specialSett: IntArray, numsList: List<Int>, type: Type): Boolean {
        if (numsList.toIntArray().size < specialSett.size) return false
        when (type) {
            FIRST -> {
                val subList = numsList.subList(1, numsList.size)
                return if (subList.toIntArray().contentEquals(specialSett)) {
                    true
                } else {
                    findSpecialSett(specialSett, subList, FIRST) &&
                            findSpecialSett(specialSett, subList, LAST)
                }
            }
            LAST -> {
                val subList = numsList.subList(0, numsList.size - 1)
                return if (subList.toIntArray().contentEquals(specialSett)) {
                    true
                } else {
                    findSpecialSett(specialSett, subList, FIRST) &&
                            findSpecialSett(specialSett, subList, LAST)
                }
            }
        }
    }

    enum class Type {
        FIRST, LAST
    }
}