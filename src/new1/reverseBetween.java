package new1;

public class reverseBetween {
    public ListNode reverse(ListNode head,int left,int right){
            ListNode dump=new ListNode(-1);
            dump.next=head;
            ListNode pre=dump;
            for (int i=0;i<left-1;i++){
                pre=pre.next;
            }
            ListNode rightNode=pre;
            for (int i=0;i<right-left+1;i++){
                rightNode=rightNode.next;
            }
            ListNode l=pre.next;
            ListNode r=rightNode.next;
            pre.next=null;
            rightNode.next=null;
            rev(l);
            pre.next=rightNode;
            l.next=r;
            return dump.next;

    }
    public void rev(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
    }
}
