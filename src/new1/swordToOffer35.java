package new1;

import java.util.*;

public class swordToOffer35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    HashMap<Node,Node> cache=new HashMap<>();
    public Node copy(Node head){
        if (head==null) return null;
        if (!cache.containsKey(head)){
            Node nhead=new Node(head.val);
            cache.put(head,nhead);
            nhead.next=copy(head.next);
            nhead.random=copy(head.random);
        }
        return cache.get(head);
    }
    public Node copyn(Node head){
        if (head==null) return null;
        for (Node node=head;node!=null;node=node.next.next){
            Node nnode=new Node(node.val);
            nnode.next=node.next;
            node.next=nnode;
        }
        for (Node node=head;node!=null;node=node.next.next){
            Node nnode=node.next;
            nnode.random=(node.random!=null)?node.random.next:null;
        }
        Node headNew=head.next;
        for (Node node=head;node!=null;node=node.next){
            Node nnode=node.next;
            node.next=node.next.next;
            nnode.next=(nnode.next!=null)?nnode.next.next:null;
        }
        return headNew;
    }
    public int[] miss(int[] roll,int m,int n){
        int all=0;
        for (int k:roll) all+=k;
        if (all+n*6<(roll.length+n)*m||all+n>(roll.length+n)*m) return new int[]{};
        int need=(roll.length+n)*m-all;
        int min=need/n;
        int last=need-min*n;
        int[] res=new int[n];
        for (int i=0;i<res.length;i++){
            if (last>0){
                res[i]=last>=6-min?6:min+last;
                last-=res[i]-min;
                continue;
            }
            res[i]=min;
        }
        return res;
    }

    static int[][] place;
    static int all;
    static int res;
    static int mn;
    static int nn;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int len=sc.nextInt();
       int len1=sc.nextInt();
       mn=len;
       nn=len1;
      place=new int[len][len1];
      all=0;
      res=Integer.MAX_VALUE;
      for (int i=0;i<len;i++){
          for (int j=0;j<len1;j++){
              place[i][j]=sc.nextInt();
          }
      }
      dfs(0,0);
      System.out.println(res);
   }
   public static void dfs(int m,int n){
        if (m==mn-1&&n==nn-1) {
            all=Math.min(all,res);
            return;
        }
        int last=all;

        if (n+1<nn){
            if (place[m][n]!=place[m][n+1]) all+=2;
            else all+=1;
            dfs(m,n+1);
            all=last;
        }
       if (m+1<mn){
           if (place[m][n]!=place[m+1][n]) all+=2;
           else all+=1;
           dfs(m+1,n);
           all=last;
       }
   }
}
