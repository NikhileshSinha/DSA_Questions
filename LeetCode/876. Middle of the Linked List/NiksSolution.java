class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p=head, ret;
        ListNode ln = new ListNode();
        ret=ln;
        
        int i=0;
        while(p!=null){
            i++;
            p=p.next;
        }
        int mid;
        if(i%2!=0){
            mid=(i+1)/2;
        }
        else{
            mid =(i+2)/2;
        }
        i=0;
        p=head;
        while(p!=null){
            i++;
            System.out.println("Inc: "+i+" val: "+p.val+" mid: "+mid);
            if(i>=mid){
                ln.val=p.val;
                if(p.next!=null){
                    ListNode nn = new ListNode();
                    ln.next=nn;
                    ln=nn;
                }
            }
            p=p.next;
        }
        return ret;
    }
}
