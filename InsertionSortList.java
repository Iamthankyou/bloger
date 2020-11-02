/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode res = new ListNode(-(1<<31));
        ListNode curr = head;
        
        while (curr!=null){
            ListNode currNext = curr.next;
            ListNode prevRes = res;
            ListNode nextRes = res.next;
            
            while (nextRes!=null){
                if (nextRes.val>curr.val){
                    break;
                }
                
                prevRes = nextRes;
                nextRes = nextRes.next;
            }
            
            curr.next = nextRes;
            prevRes.next = curr;
            curr = currNext;
        }
        
        return res.next;
    }
}
