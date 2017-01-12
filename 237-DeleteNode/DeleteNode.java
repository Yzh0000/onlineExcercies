/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        //there is no input linked list, try to change the value of node.
        node.val = node.next.val;
        node.next = node.next.next;

        
    }
}