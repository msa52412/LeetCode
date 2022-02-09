package new1;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public static int maxLength(String s){
        int left=0,right=0;
        int maxl=0;
        Set<Character> set=new HashSet<>();
        while (left<s.length()&&right<s.length()){
            while(right<s.length()&&!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            maxl=Math.max(maxl,right-left);
            set.remove(s.charAt(left));
            left++;




        }
        return maxl;
    }
    public static void main(String[] aw){
        String s="bbbb";
        System.out.print(maxLength(s));
    }
}
