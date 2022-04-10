package Sword;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class swordToOffer14 {
    public static boolean check(String s1,String s2){
        if (s1.length()>s2.length()) return false;
        int[] r1=new int[26];
        int[] r2=new int[26];
        for (int i=0;i<s1.length();i++){
            r1[s1.charAt(i)-'a']++;
            r2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(r1,r2)) return true;
        for (int i=s1.length();i<s2.length();i++){
            r2[s2.charAt(i)-'a']++;
            r2[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(r1,r2)) return true;
        }
        return false;
    }
    public static List<Integer> checkp(String s1, String s2){
        if (s1.length()>s2.length()) return new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int[] r1=new int[26];
        int[] r2=new int[26];
        for (int i=0;i<s1.length();i++){
            r1[s1.charAt(i)-'a']++;
            r2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(r1,r2)) res.add(0);
        for (int i=s1.length();i<s2.length();i++){
            r2[s2.charAt(i)-'a']++;
            r2[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(r1,r2)) res.add(i-s1.length()+1);
        }
        return res;
    }


}
