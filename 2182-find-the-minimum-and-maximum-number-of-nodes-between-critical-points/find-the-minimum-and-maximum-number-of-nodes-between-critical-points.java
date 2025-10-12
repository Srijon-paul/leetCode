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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode temp = prev.next;
        ListNode nextt = temp.next;
        int index = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(nextt != null){
            if((temp.val > prev.val && temp.val > nextt.val) || (temp.val < prev.val && temp.val < nextt.val)){
                list.add(index);
            }
            index++;
            prev = temp;
            temp = nextt;
            nextt = nextt.next;
        }
        int[] arr = {-1, -1};
        if(list.size() > 1){
            arr[1] = list.getLast() - list.getFirst();
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i + 1) - list.get(i) < min){
                    min = list.get(i + 1) - list.get(i);
                    if(min == 1){
                        break;
                    }
                }
            }
            arr[0] = min;
        }
        return arr;
    }
}