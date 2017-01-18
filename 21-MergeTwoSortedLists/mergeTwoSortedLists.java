/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode node1 = l1;
        ListNode node2 = l2;
        
        ListNode head = null;
        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        // ListNode currNode = rslt;
        // while (l1 != null || l2 != null) {
        //     if (l1 == null || l1.val > l2.val) {
        //         currNode.next = l2;
        //         currNode = l2;
        //         l2 = l2.next;
                
        //     } else {
        //         currNode.next = l1;
        //         currNode = l1;
        //         l1 = l1.next;
        //     }
        // }
        // currNode.next = null;
        
        return head;
        
        
        
    }
}