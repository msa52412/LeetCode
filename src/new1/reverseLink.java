package new1;

public class reverseLink {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode reverse(ListNode head){
        if (head.next==null) return head;
        ListNode last=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
    ListNode successor=null;
    public ListNode reverseN(ListNode head,int n){
        if (n==1){
            successor=head.next;
            return head;
        }
        ListNode last=reverseN(head.next,n-1);
        head.next.next=head;
        head.next=successor;
        return last;
    }
}
