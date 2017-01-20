/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        
        if(!head)   return head;
        
        ListNode* tmp=head;
        for(int i=0;i<k-1;i++){
            tmp=tmp->next;
            if(!tmp)    return head;
        }
        
        ListNode* dummy=new ListNode(0);
        ListNode* p1=head;
        ListNode* p2=head->next;
        for(int i=0;i<k-1;i++){
            tmp=p2->next;
            p2->next=p1;
            p1=p2;
            p2=tmp;
        }
        
        head->next=reverseKGroup(p2,k);
        return p1;
        
    }
};