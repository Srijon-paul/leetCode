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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode smallTail = smaller, greatTail = greater;

        while(head != null){
            if(head.val >= x){
                greatTail.next = head;
                greatTail = greatTail.next;
            } else{
                smallTail.next = head;
                smallTail = smallTail.next;
            }
            head = head.next;
        }
        greatTail.next = null;
        smallTail.next = greater.next;
        return smaller.next;
    }
}