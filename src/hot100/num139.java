package hot100;

import java.util.*;

public class num139 {
    public boolean search(String s, List<String> dir){
        HashSet<String> set = new HashSet<>(dir);
        char[] need=s.toCharArray();
        return dfs(0,need,set);
    }
    public boolean dfs(int p,char[] need,HashSet<String> set){
        if (need.length==p) return true;
        StringBuilder stringBuilder=new StringBuilder();
        for (int k=p;k<need.length;k++){
            stringBuilder.append(need[k]);
            if (set.contains(stringBuilder.toString())){
                if(dfs(p+stringBuilder.length(),need,set)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search1(String s,List<String> dir){
        HashSet<String> set = new HashSet<>(dir);
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for (int i=1;i<=s.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j]&&set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        num139 n=new num139();
        System.out.print(n.search1("leetcode", List.of(new String[]{"leet", "code"})));
    }


}
