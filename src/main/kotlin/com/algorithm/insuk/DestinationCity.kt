package com.algorithm.insuk

/**
 * https://leetcode.com/problems/destination-city/
 */
class DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        var _paths = paths.toMutableList()
        var (_going, _to) = _paths[0]

        _paths.removeAt(0)
        while (_paths.isNotEmpty()) {
            val (index, go, to) = findNext(_paths, _going, _to)
            _paths.removeAt(index)
            _going = go
            _to = to
        }

        return _to
    }

    private fun findNext(paths: List<List<String>>, going: String, to: String): Triple<Int, String, String> {
        var findIndex = 0
        var _going = going
        var _to = to
        paths.forEachIndexed { index, list ->
            val (goCandidate, toCandidate) = paths[index]
            if (goCandidate == to) {
                findIndex = index
                _going = goCandidate
                _to = toCandidate
            }
        }
        return Triple(findIndex, _going, _to)
    }
}