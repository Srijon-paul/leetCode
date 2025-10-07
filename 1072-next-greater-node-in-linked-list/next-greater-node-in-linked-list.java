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
    public int[] nextLargerNodes(ListNode head) {
        ListNode point = head;
        ListNode point2;
        int count = 0;
        int max = 0;
        int i = 0;
        while(point != null){
            count++;
            point = point.next;
        }
        int[] arr = new int[count];
        point = head;
        while(point != null){
            max = point.val;
            point2 = point.next;
            while(point2 != null){
                if(max < point2.val){
                    max = point2.val;
                    break;
                }
                point2 = point2.next;
            }
            if(max > point.val){
                arr[i] = max;
            } else{
                arr[i] = 0;
            }
            point = point.next;
            i++;
        }
        return arr;
    }
}