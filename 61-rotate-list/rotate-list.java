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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode last = head;
        ListNode prev = head;
        int length = 1;
        while(last != null && last.next != null){
            length++;
            last = last.next;
        }
        int rotation = k % length;
        if(rotation == 0){
            return head;
        }
        for(int i = 1; i < length - rotation; i++){
            prev = prev.next;
        }
        ListNode newHead = prev.next;
        prev.next = null;
        last.next = head;
        return newHead;
    }
}