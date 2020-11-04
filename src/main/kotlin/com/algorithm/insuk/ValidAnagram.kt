package com.algorithm.insuk

import kotlin.text.toCharArray as stepByOneStepChar

/**
 * https://leetcode.com/problems/valid-anagram/submissions/
 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val baseHashMap = hashMapOf<Char, Int>().run {
            s.stepByOneStepChar().forEach {
                this[it] = this.getOrDefault(it, 0) + 1
            }
            this
        }

        t.stepByOneStepChar().forEach {
            baseHashMap[it] = baseHashMap.getOrDefault(it, 0) - 1
        }

        return !baseHashMap.any { it.value != 0 }
    }
}