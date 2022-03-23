package new1;

public class swordToOffer18 {
    public ListNode delete(ListNode head,ListNode del){
        if (head==null) return null;
        if (head==del) return head.next;
        if (head.next!=null){
            del.val=del.next.val;
            del.next=del.next.next;
            return head;
        }
        else {
            ListNode pre=head;
            while (pre.next!=del) pre=pre.next;
            pre.next=null;
            return head;
        }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val) return head.next;
        if(head==null) return head;
        ListNode pre=new ListNode(-1);
        pre=head;
        ListNode last=null;
        while(pre.val!=val){
            last=pre;
            pre=pre.next;
        }
        last.next=pre.next;
        return head;
    }
}
