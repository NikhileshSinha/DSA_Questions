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
        if (head == null) return null;
        ListNode a=head,b=head.next;
        try{
            while(a.val == val){
                head=b;
                a=b;
                b=head.next;
            }
            while(b!=null){
                if(b.val == val){
                    b=b.next;
                    a.next=b;
                }
                else{
                    a=b;
                    b=b.next;
                }
            }
        }
        catch(Exception e){}
        return head;
    }
}
