package hot100;



public class num19 {
    public ListNode remove(ListNode head,int n){
        if (head.next==null) return null;
        if (head.next.next==null&&n==1) {
            head.next=null;
            return head;
        }
        if (head.next.next==null&&n==2) return head.next;
        ListNode pre=head;
        ListNode head1=head;
        while (n>1){
            head=head.next;
            n--;
            if (head==null||n<=1) break;
        }
        if (head.next==null) return pre.next;
        while (true){
            head=head.next;
            if (head.next==null) break;
            head1=head1.next;
            if (head1.next==null) break;

        }
        head1.next=head1.next.next;
        return pre;
    }
}
