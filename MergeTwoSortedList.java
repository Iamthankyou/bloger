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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode iter = res;
        
        while (l1!=null && l2!=null){
            if (l1.val <l2.val){
                if (res != null){
                    res.next = l1;
                    res = res.next;
                }
                else{
                    res = l1;
                }
                
                l1 = l1.next;
            }
            else{
                if (res != null){
                    res.next = l2;
                    res = res.next;
                }
                else{
                    res = l2;
                }
                
                l2 = l2.next;
            }
        }
        
        while (l1!=null){
            res.next = l1;
            l1 = l1.next;
            res = res.next;
        }
        
        while (l2!=null){
            res.next = l2;
            l2=l2.next;
            res = res.next;
        }
        
        return iter.next;
    }
}
