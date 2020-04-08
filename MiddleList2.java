// duynotes.blogspot.com
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode mid = head;
        while(head!=null){
            if (count%2==1){
                mid=mid.next;
            }
            count++;
            head=head.next;
        }
        return mid;
    }
}
