package new1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAllAnagramsInAString {
    public List<Integer> minwindows(String s, String t){
        int left=0,right=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
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
                if (right-left==t.length()){
                    res.add(left);
                }
                char c2=s.charAt(left);
                if (need.containsKey(c2)){
                    if (win.get(c2).equals(need.get(c2))) match--;
                    win.put(c2,win.get(c2)-1);
                }
                left++;
            }
        }
        return res;
    }
    public List<Integer> minwindows1(String s, String t){
        ArrayList<Integer> ans=new ArrayList<>();
        if (s.length()<t.length()) return ans;
        int[] arr=new int[26];
        int all=t.length();
        for (char c:t.toCharArray()) arr[c-'a']++;
        char[] str=s.toCharArray();
        int l=0,r=0,n=s.length();
        while (l<n){
            while (r<n&&arr[str[r]-'a']>0){
                all--;
                arr[str[r]-'a']--;
                r++;
            }
            if (all==0) ans.add(l);
            arr[str[l]-'a']++;
            all++;
            l++;

        }
        return ans;
    }
}
