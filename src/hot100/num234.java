package hot100;

public class num234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode reverse(ListNode head){
        if (head.next==null) return head;
        ListNode last=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
public boolean is(ListNode head){
        if (head==null||head.next==null) return true;
        if (head.next.next==null){
            return head.val == head.next.val;
        }
        int n=1;
    ListNode pre=head;
    while (pre.next!=null){
        pre=pre.next;
        n++;
    }
    pre = head;
    ListNode now = head;
    ListNode pe=head;
    while (pre!=null&&pre.next != null) {
        pe = now;
        pre = pre.next.next;
        now = now.next;
    }
    if (n%2==1) {
        pre=now.next;
        pe.next=null;
        ListNode rev=reverse(head);
        while (rev!=null&&pre!=null){
            if (rev.val!= pre.val) return false;
            rev=rev.next;
            pre=pre.next;
        }
    }
    else {
        pe.next=null;
        pre=now;
        ListNode rev=reverse(head);
        while (rev!=null&&pre!=null){
            if (rev.val!= pre.val) return false;
            rev=rev.next;
            pre=pre.next;
        }
    }
    return true;

}
}
