package com.algorithm.insuk

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
 */
class SwapNodesInPairs {
    // Given 1->2->3->4, you should return the list as 2->1->4->3.
    fun swapPairs(head: ListNode?): ListNode? {
        head?.next?.let {
            val temp = it
            head.next = swapPairs(it.next)
            temp.next = head
            return temp
        } ?: return head
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}