package new1;

import java.util.LinkedList;
import java.util.Queue;

public class swordToOffer12 {
    static char[] need;
    public static boolean ex(char[][] b,String s){
        need=s.toCharArray();
        if (need.length==900) return true;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                if (b[i][j]==need[0]){
                    boolean[][] iss=new boolean[b.length][b[0].length];
                    iss[i][j]=true;
                    if (need.length==1||search(b,1,i,j,iss)) return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] b,int c,int i,int j,boolean[][] iss){
        boolean a1=false,a2=false,a3=false,a4=false;
        if (j+1<b[0].length&&b[i][j+1]==need[c]&&!iss[i][j+1]){
            iss[i][j+1]=true;
            a1=c==need.length-1||search(b,c+1,i,j+1,iss);
            iss[i][j+1]=false;
        }
        if (j-1>=0&&b[i][j-1]==need[c]&&!iss[i][j-1]){
            iss[i][j-1]=true;
            a2=c==need.length-1||search(b,c+1,i,j-1,iss);
            iss[i][j-1]=false;
        }
        if (i-1>=0&&b[i-1][j]==need[c]&&!iss[i-1][j]){
            iss[i-1][j]=true;
            a3=c==need.length-1||search(b,c+1,i-1,j,iss);
            iss[i-1][j]=false;
        }
        if (i+1<b.length&&b[i+1][j]==need[c]&&!iss[i+1][j]){
            iss[i+1][j]=true;
            a4=c==need.length-1||search(b,c+1,i+1,j,iss);
            iss[i+1][j]=false;
        }
        return a1||a2||a3||a4;
    }

    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'a','b','c','e'},{'s','f','e','s'},{'a','d','e','e'}},"abceseeefs"));

    }
    public static boolean exist(char[][] b,String s){
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                if(dfs(b,s,i,j,0)) return true;
            }
        }
        return false;
    }
    public static boolean dfs(char[][] b,String s,int i,int j,int k){
        if (i>=b.length||i<0||j>=b[0].length||j<0||b[i][j]!=s.charAt(k)) return false;
        if (k==s.length()-1) return true;
        b[i][j]='*';
        boolean res=dfs(b,s,i,j+1,k+1)||dfs(b,s,i,j-1,k+1)||dfs(b,s,i+1,j,k+1)||dfs(b,s,i-1,j,k+1);
        b[i][j]=s.charAt(k);
        return  res;
    }


}
