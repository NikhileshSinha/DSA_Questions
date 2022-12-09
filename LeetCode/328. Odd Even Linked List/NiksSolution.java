class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode nnO = new ListNode();
        ListNode nnE1 = new ListNode();
        ListNode ret = nnO, nnE2=nnE1;
        int i=1;
        while(head!=null){
            try{
                if(i%2!=0){
                nnO.val = head.val;
                if(head.next.next!=null){
                    ListNode nn = new ListNode();
                    nnO.next = nn;
                    nnO=nn;
                }
            }
                else{
                    nnE1.val = head.val;
                    if(head.next.next!=null){
                        ListNode nn = new ListNode();
                        nnE1.next = nn;
                        nnE1=nn;
                    }
                }
            }
            catch(Exception e){}
            head=head.next;
            i++;
        }
        nnO.next = nnE2;
        return ret;
    }
}
