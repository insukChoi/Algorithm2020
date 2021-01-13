package com.algorithm.insuk

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StudentAttendanceRecordTest {
    @Test
    fun `예제1`() {
        assertEquals(true,
            StudentAttendanceRecord().checkRecord(
                s = "PPALLP"
            )
        )
    }

    @Test
    fun `예제2`() {
        assertEquals(false,
            StudentAttendanceRecord().checkRecord(
                s = "PPALLL"
            )
        )
    }
}