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
    public ListNode doubleIt(ListNode head) {
        ListNode tail = head;
        while(tail != null){
            if(tail == head && tail.val >= 5){
                ListNode node = new ListNode(1);
                node.next = tail;
                head = node;
            }
            tail.val = (tail.val * 2) % 10;
            if(tail.next != null && tail.next.val >= 5){
                tail.val += 1;
            }
            tail = tail.next;
        }
        return head;
    }
}