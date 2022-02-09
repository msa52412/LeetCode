package new1;

import java.util.HashMap;
import java.util.Map;

public class minimumWindowSubstring {
    public String minwindows(String s,String t){
        int start=0,minlen=Integer.MAX_VALUE;
        int left=0,right=0;
        Map<Character,Integer> win=new HashMap<>();
        Map<Character,Integer> need=new HashMap<>();
        for (char c:t.toCharArray()) need.put(c,need.getOrDefault(c,0)+1);
        int match=0;
        while (right<s.length()){
            char c1=s.charAt(right);
            if (need.containsKey(c1)){
                win.put(c1,win.getOrDefault(c1,0)+1);
                if (win.get(c1).equals(need.get(c1))) match++;
            }
            right++;
            while (match==need.size()){
                if (right-left<minlen){
                    start=left;
                    minlen=right-left;
                }
                char c2=s.charAt(left);
                if (need.containsKey(c2)){
                    if (win.get(c2).equals(need.get(c2))) match--;
                    win.put(c2,win.get(c2)-1);
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
