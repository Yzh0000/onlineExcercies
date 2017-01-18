/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        //by induction
        // if (head == null) return null;
        if (head == null || head.next == null) return head;
        
        ListNode newHead = head.next;
        ListNode nextHead = swapPairs(head.next.next);
        newHead.next = head;
        head.next = nextHead;
        
        return newHead;

        
    }
}