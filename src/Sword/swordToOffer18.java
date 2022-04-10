package Sword;

import java.util.ArrayList;
import java.util.List;

public class swordToOffer18 {
    public static boolean is(String s){
        List<Character> s1=get(s);
        if(s1.size()==1||s1.size()==0) return true;
        for (int i=0,j=s1.size()-1;i<=j;i++,j--){
            if (s1.get(i)!=s1.get(j)) return false;
        }
        return true;
    }
    public static List<Character> get(String s){
        List<Character> list=new ArrayList<>();
        for (char c:s.toCharArray()){
            if ((c<'A'||c>'z'||(c<'a'&&c>'Z'))&&(c<48||c>57)) continue;
            list.add((char)(c|0b100000));
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(is("A man, a plan, a canal: Panama"));
    }
}
