package com.algorithm.insuk

class KthSymbolInGrammer {
    fun kthGrammar(N: Int, K: Int): Int {
        if (N == 1) return 0

        val queue = mutableListOf<Int>().also {
            it.add(0)
        }

        for (i in 2..N) {
            val tempQueue = mutableListOf<Int>().also {
                it.addAll(queue)
            }.let {
                while (queue.isNotEmpty()) {
                    it.add(1 - queue.removeAt(0))
                }
                it
            }
            queue.addAll(tempQueue)
        }

        return queue[K-1]
    }
}