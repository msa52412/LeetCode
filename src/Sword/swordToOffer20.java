package Sword;

import new1.TreeNode;

public class swordToOffer20 {
    private int res;
    public int count(String s){
        if (s.length()==1) return 1;
        res=s.length();
        for (int i=1;i<s.length()-1;i++){
            count1(s,i);
            count2(s,i-1,i);
        }
        count2(s,s.length()-2,s.length()-1);
        return res;
    }
    public void count1(String s,int p){
        int l=p-1,r=p+1;
        while (true){
            if (s.charAt(l)==s.charAt(r)){
                res++;
                l--;
                r++;
                if (l==-1||r==s.length()) return;
            }
            else return;
        }
    }
    public void count2(String s,int l,int r){
        while (true){
            if (s.charAt(l)==s.charAt(r)){
                res++;
                l--;
                r++;
                if (l==-1||r==s.length()) return;
            }
            else return;
        }
    }
}
