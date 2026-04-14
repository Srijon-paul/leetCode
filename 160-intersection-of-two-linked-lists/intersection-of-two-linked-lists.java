/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0;
        ListNode a = headA, b = headB;
        while(a != null){
            countA++;
            a = a.next;
        }
        while(b != null){
            countB++;
            b = b.next;
        }
        int diff = Math.abs(countA - countB);
        while(diff > 0){
            if(countB > countA){
                headB = headB.next;
            }else{
                headA = headA.next;
            }
            diff--;
        }
        while(headA != null || headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}