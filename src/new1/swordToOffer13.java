package new1;

import java.util.LinkedList;
import java.util.Queue;

public class swordToOffer13 {
    public static int move(int m,int n,int k){
        boolean[][] is=new boolean[m][n];
        int res=0;
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});
        while (!queue.isEmpty()){

            int[] eve=queue.poll();
            if (eve[0]/100+(eve[0]%100)/10+eve[0]%10+eve[1]/100+(eve[1]%100)/10+eve[1]%10<=k){
                    res+=1;
                if (eve[1]+1<n&&!is[eve[0]][eve[1]+1]){
                    queue.add(new int[]{eve[0],eve[1]+1});
                    is[eve[0]][eve[1]+1]=true;
                }
                if (eve[0]+1<m&&!is[eve[0]+1][eve[1]]){
                    queue.add(new int[]{eve[0]+1,eve[1]});
                    is[eve[0]+1][eve[1]]=true;
                }

            }


        }
        return res;
    }
    private static boolean[][] isi;
    private static int ress;
    public static int move1(int m,int n,int k){
        isi=new boolean[m][n];
        ress=0;
        dfs(0,0,k,m,n);
        return ress;
    }
    public static void dfs(int i,int j,int k,int m,int n){
        if (isi[i][j]) return;
        if (i/100+(i%100)/10+i%10+j/100+(j%100)/10+j%10<=k) {
            ress++;
            isi[i][j]=true;
            if (i+1<m){
                dfs(i+1,j,k,m,n);
            }
            if (j+1<n){
                dfs(i,j+1,k,m,n);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(move1(16,8,4));
    }
}
