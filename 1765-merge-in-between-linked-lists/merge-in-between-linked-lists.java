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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail2 = list2;
        while(tail2.next != null){
            tail2 = tail2.next;
        }
        ListNode prev = list1;
        ListNode temp = prev.next;
        int i = 1;
        while(prev != null && prev.next != null){
            temp = prev.next;
            if(i == b && i == a){
                prev.next = list2;
                prev = temp;
                tail2.next = prev.next;
            }
            if(i == a){
                prev.next = list2;
                prev = temp;
                temp = temp.next;
                i++;
            }
            if(i == b){
                tail2.next = temp.next;
            }
            prev = prev.next;
            i++;
        }
        return list1;
    }
}