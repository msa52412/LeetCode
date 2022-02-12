package new1;

public class removeLinkedListElements {
    public ListNode remove(ListNode head,int val){
        if (head==null) return null;
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if (head==null) return null;
        ListNode pre=head;
        while (pre.next!=null){
            if (pre.next.val==val){
                pre.next=pre.next.next;
            }
            else {
                pre=pre.next;
            }
        }
        return head;
    }
    public ListNode remove1(ListNode head,int val){
        if (head==null) return null;
       head.next=remove1(head,val);
       return head.val==val?head.next:head;
    }
}
