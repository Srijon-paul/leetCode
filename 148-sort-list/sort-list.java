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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = slow;
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if(prev != null){
            prev.next = null;
        }
        return slow;
    }
    ListNode merge(ListNode head1, ListNode head2){
        ListNode newList = new ListNode();
        ListNode head = newList;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                head.next = head1;
                head1 = head1.next;
                head = head.next;
            } else{
                head.next = head2;
                head2 = head2.next;
                head = head.next;
            }
        }
        while(head1 != null){
            head.next = head1;
            head1 = head1.next;
            head = head.next;
        }
        while(head2 != null){
            head.next = head2;
            head2 = head2.next;
            head = head.next;
        }
        return newList.next;
    }
}