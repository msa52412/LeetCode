package Sword;

import java.util.*;

public class swordToOffer22 {
    public ListNode cycle(ListNode head){
        if (head==null) return null;
        ListNode slow=head,fast=head;
        while (fast!=null){
            slow=slow.next;
            if (fast.next!=null){
                fast=fast.next.next;
            }
            else return null;
            if (fast==slow) {
                ListNode pre=head;
                while (pre!=slow){
                    pre=pre.next;
                    slow=slow.next;
                }
                return pre;
            }
        }
        return null;
    }
    public ListNode get(ListNode a,ListNode b){
        if (a==null||b==null) return null;
        ListNode ahead=a,bhead=b;
        while (a!=b){
            a=a==null?bhead:a.next;
            b=b==null?ahead:b.next;
        }
        return a;
    }

}
