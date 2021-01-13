package com.algorithm.insuk

class DeleteOperationforTwoStrings {
    fun minDistance(word1: String, word2: String): Int {
        return findNotContainsCount(_base = word1, _target = word2).run {
            this.plus(findNotContainsCount(_base = word2, _target = word1))
        }
    }

    private fun findNotContainsCount(_base: String, _target: String): Int {
        var count = 0
        var base = _base
        while (base.isNotEmpty()) {
            if (_target.contains(base)) {
                count = _target.length - base.length
                break
            } else {
                base = base.removeRange(IntRange(0, 0))
                continue
            }
        }
        return count
    }
}