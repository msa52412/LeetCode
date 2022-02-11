package new1;

import java.util.HashMap;

public class firstUniqueCharacterInAString {
    public static int findFir(String s){
        int[] num=new int[26];
        int len=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()){
            len++;
            num[c-'a']++;
            if (num[c-'a']<2){
            map.put(c-'a',len);
            }
        }
        len=Integer.MAX_VALUE;
        for (int i=0;i<26;i++){
           if (num[i]==1){
               len=Math.min(len,map.get(i));
           }
        }
        return len==Integer.MAX_VALUE?-1:len;
    }
    public static void main(String[] a ){
        System.out.println(findFir("laaa"));
    }
}
