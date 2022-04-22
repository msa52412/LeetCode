package hot100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class num142 {
    public boolean ishas(ListNode head){
        if (head==null||head.next==null) return false;
        ListNode pre=head.next;
        while (pre!=head){
            if (pre==null||pre.next==null) return false;
            pre=pre.next.next;
            head=head.next;
        }
        return true;
    }
    public ListNode get(ListNode head){
        if (head==null||head.next==null) return null;
        if (head.next==head) return head;
        ListNode pre=head.next;
        ListNode now=head;
        while (true){
            if (pre==null||pre.next==null) return null;
            pre=pre.next.next;
            now=now.next;
            if (pre==now){
                ListNode ptr=head;
                pre=pre.next;
                while (ptr!=pre){
                    ptr=ptr.next;
                    pre=pre.next;
                }
                return pre;
            }
        }
    }
}
