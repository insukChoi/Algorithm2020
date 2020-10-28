package com.algorithm.insuk

class FibonacciNumber {
    fun fib(N: Int): Int {
        if (N == 1) return 1
        return F(N-1) + F(N-2)
    }

    private fun F(i: Int): Int {
        return if (i > 1) F(i-1) + F(i-2)
        else when(i) {
            1 -> 1
            else -> 0
        }
    }
}