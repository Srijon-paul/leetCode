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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode node = head;
        while(node != null){
            if(head.next == null){
                if(head.val == val){
                    return null;
                } else{
                    return head;
                }
            }
            if(head.next != null && head.val == val){
                head = head.next;
            } else{
                node = prev.next;
                if(node.val == val){
                    if(node.next == null){
                        prev.next = null;
                        return head;
                    } else{
                        prev.next = node.next;
                        node = prev.next;
                    }
                } else{
                    prev = node;
                    node = prev.next;
                }
            }
        }
        return head;
    }
}