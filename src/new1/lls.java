package new1;

public class lls {
    public ListNode form(ListNode head){
        if (head==null||head.next==null||head.next.next==null) return head;
        ListNode res=new ListNode(head.val);
        head=head.next;
        ListNode last = res;
        while (head!=null){
            res.next=new ListNode(head.val);
            head=head.next;
            if (head==null) break;
            ListNode pre=new ListNode(head.val);
            pre.next=last;
            last=pre;
            res=res.next;
            head=head.next;
            if (head==null) break;

        }
        return last;
    }
    public long and(int[] arr,int k){
        long res=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]<=k) res++;
            }
        }
        return res;
    }
    public long min(int[] a){
        long all=0;
        for (int k:a) all++;
        long eve=0;
        long res=Long.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            eve+=a[i];
            for (int j=i+1;j<a.length;j++){
                eve+=a[j];
                res=Math.min(res,(all-2*eve)>=0?all-2*eve:-(all-2*eve));
            }
            eve-=a[i];
        }
        return res;
    }


}
