package new1;

import java.util.HashSet;
import java.util.Set;

public class swordToOffer52 {
    ListNode getfir(ListNode a,ListNode b){
        if(a==null||b==null) return null;
        Set<ListNode> set=new HashSet<>();
        ListNode pa=a;
        while (pa.next!=null) {
            set.add(pa);
            pa=pa.next;
        }
        while (b.next!=null){
            if (set.contains(b)) return b;
            b=b.next;
        }
        return null;
    }
    ListNode getfirnode(ListNode a,ListNode b){
        if(a==null||b==null) return null;
        ListNode pa=a;
        ListNode pb=b;
        while (pa!=pb){
            pa=pa==null?b:pa.next;
            pb=pb==null?a:pb.next;
        }
        return pa;
    }
}
