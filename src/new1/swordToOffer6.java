package new1;

import java.util.List;
import java.util.Stack;

public class swordToOffer6 {
    public int[] reverse(ListNode head){
        Stack <Integer> res=new Stack<>();
        while (head!=null){
            res.push(head.val);
            head=head.next;
        }
        int[] resint=new int[res.size()];
        int i=0;
        while (!res.isEmpty()){
            resint[i]=res.pop();
            i++;
        }
        return resint;
    }
    public int[] reverse1(ListNode head){
        int len=0;
        ListNode pre=head;
        while (pre!=null){
            len++;
            pre=pre.next;
        }
        int[] res=new int[len];
        while (head!=null){
            res[len-1]=head.val;
            len--;
            head=head.next;
        }
        return res;
    }
}
