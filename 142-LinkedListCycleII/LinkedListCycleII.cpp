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
    ListNode *detectCycle(ListNode *head) {

        if(!head||!head->next)  return NULL;
        ListNode* p1=head;
        ListNode* p2=head;        
        ListNode* p3=head;
        
        while(p1->next&&p1->next->next){
            p1=p1->next->next;
            p2=p2->next;
            
            if(p1==p2)  
            {
                while(p3!=p2){
                    p3=p3->next;
                    p2=p2->next;
                }
                return p3;
            }
        }
        
        return NULL;
    }
};