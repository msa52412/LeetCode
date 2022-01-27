package new1;

import java.util.LinkedList;
import java.util.Queue;

public class swordi1 {
    public static void main(String[] aw){
        String s="abcde";
        String[] words={"a","bb","acd","ace"};
        System.out.print(getnum(s,words));
    }
    public static int getnum(String s, String[] words){
        node[] map=new node[26];
        for (int i=0;i<26;i++){
            map[i]=new node();
        }
        for (String w:words){

            map[(byte)w.charAt(0)-'a'].word.add(w);

        }
        int res=0;
        for (char c:s.toCharArray()){
            Queue<String> str = new LinkedList<>();

            while (map[c-'a'].word.peek()!=null){
                String a=map[c-'a'].word.poll();
                if (c==a.charAt(0)&&a.length()==1){
                    res+=1;
                }
                else {
                    a=a.substring(1);
                    str.add(a);

                }


            }
            while (str.peek()!=null){
                String b=str.poll();
                char m=b.charAt(0);
                map[m-'a'].word.add(b);
            }


        }
         return res;

    }
    static class node{
        Queue<String> word;
        int num;

        public node(){
            word=new LinkedList<>();
            num=0;

        }
    }

}
