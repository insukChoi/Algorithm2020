package com.algorithm.insuk

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SwapNodesInPairsTest {
    @Test
    fun `인접한 두개 쌍의 노드가 SWAP 되는지 테스트`() {
        val givenListNode = givenInputListNode()
        Assertions.assertEquals(verifyOutputListNode(), SwapNodesInPairs().swapPairs(givenListNode))
    }

    /**
     * 테스트 결과 값 (Expect)
     */
    private fun verifyOutputListNode(): ListNode {
        val listNode4 = ListNode(3)
        val listNode3 = ListNode(4).apply {
            next = listNode4
        }
        val listNode2 = ListNode(1).apply {
            next = listNode3
        }
        val listNode1 = ListNode(2).apply {
            next = listNode2
        }
        return listNode1
    }

    /**
     * 테스트 input 값 (Given)
     */
    private fun givenInputListNode(): ListNode {
        val listNode4 = ListNode(4)
        val listNode3 = ListNode(3).apply {
            next = listNode4
        }
        val listNode2 = ListNode(2).apply {
            next = listNode3
        }
        val listNode1 = ListNode(1).apply {
            next = listNode2
        }
        return listNode1
    }

}