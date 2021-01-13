package com.algorithm.insuk

class RankTransformOfAnArray {
    private var duplicateCnt = 0
    fun arrayRankTransform(arr: IntArray): IntArray {
        val rankArray = mutableListOf<Int>()
        arr.forEachIndexed { index, it ->
            rankArray.add(getRank(it, arr, rankArray))
        }
        return rankArray.toIntArray()
    }

    private fun getRank(value: Int, arr: IntArray, rankArray: MutableList<Int>): Int {
        val tempArr = arr.clone()
        tempArr.sort()
        tempArr.forEachIndexed { index, it ->
            if (it == value){
                return if (rankArray.size > 0 && rankArray.last() == index-1) {
                    duplicateCnt ++
                    index
                } else {
                    index + 1 - duplicateCnt
                }
            }
        }
        return 0
    }
}