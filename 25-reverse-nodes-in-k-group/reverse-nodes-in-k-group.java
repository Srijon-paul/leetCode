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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode res = null;
        ListNode prevLeft = null;
        ListNode left = head;
        ListNode right = null;
        while(true){
            right = left;
            for(int i = 0; i < k - 1; i++){
                if(right == null) break;
                right = right.next;
            }
            if(right != null){
                ListNode nextLeft = right.next;
                reverse(left, k);
                if(prevLeft != null){
                    prevLeft.next = right;
                }
                prevLeft = left;
                if(res == null){
                    res = right;
                }
                left = nextLeft;
            } else{
                if(prevLeft != null){
                    prevLeft.next = left;
                }
                if(res == null){
                    res = left;
                }
                break;
            }
        }
        return res;
    }
    void reverse(ListNode left, int size){
        ListNode prev = null;
        ListNode curr = left;
        while(size > 0){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            size--;
        }
    }
}