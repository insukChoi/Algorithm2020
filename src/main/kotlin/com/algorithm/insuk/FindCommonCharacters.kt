package com.algorithm.insuk

import kotlin.streams.toList

class FindCommonCharacters {
    //  ["bella","label","roller"]
    //  ["cool","lock","cook"]
    fun commonChars(A: Array<String>): List<String> {
        val firstCharArr = A[0].toCharArray().toMutableList()
        (1..A.size).forEach {
            firstCharArr.forEach { c ->
                if (!A[it].toCharArray().contains(c)){
                    firstCharArr.remove(c)
                }
            }
        }

        return firstCharArr.stream().map {
            it.toString()
        }.toList()
    }
}