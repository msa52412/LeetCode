package new1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class swordToOffer48 {
    public int getMax(String s){
        if (s.length()==0) return 0;
        int max=1;
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){

                if(set.contains(s.charAt(j))){
                    break;
                }
                else {
                    max=Math.max(max,j-i+1);
                }
                set.add(s.charAt(j));
            }
        }
        return max;
    }
    public static int len(String s){
        if (s==" ") return 0;
        if (s.length()==0||s.length()==1) return s.length();
        char[] ss=s.toCharArray();
        int l=0,r=0;
        int res=0;
        Set<Character> set=new HashSet<>();
        while (r<ss.length){
            while (set.contains(ss[r])){
                set.remove(ss[l]);
                l++;
            }
            set.add(ss[r]);
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(len("pwwkew"));
    }
}
