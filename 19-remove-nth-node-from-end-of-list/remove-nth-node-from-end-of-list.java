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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null){
        return head;
       }
       int length = 0;
       ListNode node = head;
       ListNode prev = head;
       while(node != null && node.next != null){
        length++;
        node = node.next;
       }
       node = head;
       for(int i = 0; i <= length - n; i++){
        prev = node;
        node = node.next;
       }
       if(node == head && head.next == null){
        return null;
       } else{
        if(node == head){
            head = head.next;
            return head;
        } else{
            prev.next = node.next;
            return head;
        }
       }
    }
}