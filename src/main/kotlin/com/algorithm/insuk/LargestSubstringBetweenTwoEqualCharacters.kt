package com.algorithm.insuk

class LargestSubstringBetweenTwoEqualCharacters {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        var longestSize = -1
        var _s = s
        while (_s.length > 1) {
            if (_s.first() == _s.last()) {
                _s = removeFirstAndLast(_s)
                longestSize = if (longestSize >= _s.length) longestSize else _s.length
            } else {
                _s = removeFirstAndLast(_s)
            }
        }
        return longestSize
    }

    private fun removeFirstAndLast(_s: String): String {
        var _s1 = _s
        _s1 = _s1.removeRange(0, 1)
        _s1 = _s1.removeRange(_s1.length - 1, _s1.length)
        return _s1
    }
}