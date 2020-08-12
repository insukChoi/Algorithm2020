package com.algorithm.insuk

import java.lang.RuntimeException

// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
class LongestSubstringWithoutRepeatingCharacters {
    fun subStringNoDuplicateCnt(s: String): Int {
        val strAppend = StringBuffer()
        var maxCnt = 0
        s.forEach {
            maxCnt = when (strAppend.contains(it)) {
                true -> {
                    maxCnt = strAppend.length.coerceAtLeast(maxCnt)
                    strAppend.delete(0, strAppend.indexOf(it) + 1)
                        .append(it)
                    maxCnt
                }
                false -> {
                    strAppend.append(it)
                    strAppend.length.coerceAtLeast(maxCnt)
                }
            }
        }

        // post condition
        if (maxCnt < 0) throw RuntimeException("0 보다 작을수가 없습니다.")
        return maxCnt
    }
}
