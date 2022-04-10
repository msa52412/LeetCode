package Sword;



public class swordToOffer21 {
    public ListNode remove(ListNode head, int n){
        if (n==1&&head.next==null) return null;

        ListNode res=head;
        ListNode last=head;
        while (n>0){
            head=head.next;
            n--;
        }
        if (head==null) return res.next;
        while (head.next!=null){
            head=head.next;
            last=last.next;
        }
        last.next=last.next.next;
        return res;

    }
}
