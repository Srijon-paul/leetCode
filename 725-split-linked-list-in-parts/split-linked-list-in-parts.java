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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int N = 0;
        while (temp != null) {
            N++;
            temp = temp.next;
        }

        ListNode[] arr = new ListNode[k];
        int extra = N % k;
        int base = N / k;

        ListNode current = head;
        int i = 0;

        while (i < k && current != null) {
            arr[i] = current;
            int currentPartSize = base + (extra > 0 ? 1 : 0);
            extra--;
            for (int j = 1; j < currentPartSize; j++) {
                if (current != null) {
                    current = current.next;
                }
            }
            if (current != null) {
                ListNode nextPartHead = current.next;
                current.next = null;
                current = nextPartHead;
            }

            i++;
        }
        while (i < k) {
            arr[i] = null;
            i++;
        }

        return arr;
    }
}