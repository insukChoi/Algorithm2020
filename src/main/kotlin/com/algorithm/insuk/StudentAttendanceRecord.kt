package com.algorithm.insuk

/**
 * https://leetcode.com/problems/student-attendance-record-i/submissions/
 */
class StudentAttendanceRecord {
    fun checkRecord(s: String) = !(s.count {it == 'A'} >= 2 || "LLL" in s)
}