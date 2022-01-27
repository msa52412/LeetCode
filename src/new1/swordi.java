package new1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class swordi {
    public static int getnum(String s,String[] words){
       node[] table=new node[26];
       for (int i=0;i<26;i++){
           table[i]=new node();
       }
       for (int i=0;i<s.length();i++){
           char c=s.charAt(i);
           table[c-'a'].charindex.add(i);

       }
       int result=0;
       for(String word:words){
           if(isequal(word,table)){
               result++;
           }
       }
       return result;

    }
    public static boolean isequal(String s,node[] table){
        for (int i=0;i<26;i++){
            table[i].currindex=-1;
        }
        int currPosition=-1;
        for (int i=0;i<s.length();i++){
            if(table[s.charAt(i)-'a'].charindex.size()<1) return false;
        }
        for (int j=0;j<s.length();j++){
            char c=s.charAt(j);
            currPosition=findC(c,table,currPosition);
            if(currPosition==-1){
                return false;
            }
        }
        return true;

    }
    public static int findC(char c,node[] table,int currPosition){
        ArrayList<Integer> index=table[c-'a'].charindex;
        int left=table[c-'a'].currindex+1;
        int right=index.size()-1;
        if(index.get(right)<=currPosition||left>right) return -1;
        int mid=-1;
        while (left<right) {
            mid = (right + left) / 2;
            if (index.get(mid) > currPosition) {
                right=mid-1;
            }
            else {
                left=mid+1;
            }

        }
        mid=(left+right)/2;
        if(index.get(mid)>currPosition){
            table[c-'a'].currindex=mid;
            return index.get(mid);
        }
        else {
            table[c-'a'].currindex=mid+1;
            return index.get(mid+1);
        }

    }
    public static void main(String[] aw){
        String s="abcde";
        String[] words={"a","bb","acd","ace"};
        System.out.print(getnum(s,words));
    }
    static class node{
        int currindex;
        ArrayList<Integer> charindex;
        public node(){
            currindex=-1;
            charindex=new ArrayList<Integer>();
        }

    }
}
