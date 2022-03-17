package new1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Trie {
    private Trie[] children;
    private boolean isEnd;
    public Trie(){
        children=new Trie[26];
        isEnd=false;
    }
    public void insert(String word){
        Trie node=this;
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            if (node.children[index]==null){
                node.children[index]=new Trie();
            }
            node=node.children[index];
        }
        node.isEnd=true;
    }
    public boolean search(String word){
        Trie node=searchPrefix(word);
        return node!=null&&node.isEnd;
    }
    public boolean startsWith(String prefix){
        return searchPrefix(prefix)!=null;
    }
    public Trie searchPrefix(String prefix){
        Trie node=this;
        for (int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            int index=ch-'a';
            if (node.children[index]==null){
                return null;
            }
            node=node.children[index];
        }
        return node;
    }
    //应用
    public String longest(String[] word){
        Trie t=new Trie();
        for (String w:word){
            t.insert(w);
        }
        String res="";
        for (String w:word){
            if (t.search(w)){
                if (w.length()>res.length()||(w.length()==res.length()&&w.compareTo(res)<0)){
                    res=w;
                }
            }
        }
        return res;
    }
    public String longest1(String[] word){
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()) return o2.compareTo(o1);
                else return o1.length()-o2.length();
            }
        });
        String res="";
        Set<String> set=new HashSet<String>();
        set.add("");
        for (int i=0;i<word.length;i++){
            String w=word[i];
            if (set.contains(w.substring(0,w.length()-1))){
                set.add(w);
                res=w;
            }
        }
        return res;
    }
}
