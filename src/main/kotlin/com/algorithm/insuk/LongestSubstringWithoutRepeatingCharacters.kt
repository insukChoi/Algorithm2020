package com.algorithm.insuk

import java.lang.RuntimeException

class LongestSubstringWithoutRepeatingCharacters {
    fun subStringNoDuplicateCnt(s: String?): Int {
        // pre condition
        s ?: throw IllegalArgumentException("Null 말고 String 입력 부탁드립니다.")

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
