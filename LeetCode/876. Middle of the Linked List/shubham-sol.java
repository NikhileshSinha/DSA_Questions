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
    public ListNode middleNode(ListNode head) {
        ListNode t = head, p = head;
        int size, mid;
        size = 0;
        while (t != null) {
            size++;
            t = t.next;
        }
        mid = size / 2;
        for (int i = 0; i < mid; i++)
            p = p.next;
        return p;
    }
}