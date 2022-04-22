package hot100;

public class num148 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode sortList(ListNode head){
        if (head==null||head.next==null) return head;
        ListNode mid=getMid(head);
        ListNode rhead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rhead);
        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode pre=new ListNode(-1);
        ListNode now=pre;
        while (l1!=null&&l2!=null){
            if (l1.val< l2.val){
                now.next=l1;
                l1=l1.next;
            }
            else {
                now.next=l2;
                l2=l2.next;
            }
            now=now.next;
        }
        now.next=l1==null?l2:l1;
        return pre.next;
    }
    public ListNode getMid(ListNode head){
        if (head==null||head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
