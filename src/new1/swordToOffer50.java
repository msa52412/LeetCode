package new1;

import java.util.HashSet;
import java.util.Set;

public class swordToOffer50 {
    public char fir(String s){
        char[] ch=s.toCharArray();
        int[] count=new int[26];
        for (char c:ch){
            count[c-'a']++;
        }
        for (char c:ch) if (count[c-'a']==1) return c;
        return ' ';
    }
}
