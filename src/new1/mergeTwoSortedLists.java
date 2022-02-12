package new1;

public class mergeTwoSortedLists {
    public ListNode merge(ListNode l1,ListNode l2){
       if (l1==null) return l2;
       else if (l2==null) return l1;
       else if (l1.val>l2.val){
           l2.next=merge(l1,l2.next);
           return l2;
       }
       else {
           l1.next=merge(l1.next,l2);
           return l1;
       }
    }
    public ListNode merge1(ListNode l1,ListNode l2){
        ListNode pre=new ListNode(-1);
        ListNode r=pre;
        while (l1!=null||l2!=null){
            if (l1==null){
                r.next=l2;
                l2=l2.next;
            }
            else if (l2==null){
                r.next=l1;
                l1=l1.next;
            }
            else {
                if (l1.val>l2.val){
                    r.next=l2;
                    l2=l2.next;
                }
                else{
                    r.next=l1;
                    l1=l1.next;}
            }
            r=r.next;
        }
        return pre.next;
    }
}
