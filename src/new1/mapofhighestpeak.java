package new1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class mapofhighestpeak {
    public int[][] high(int[][] isW){
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int m=isW.length,n=isW[0].length;
        int[][] res=new int[m][n];
        for (int k=0;k<m;k++){
            Arrays.fill(res[k],-1);
        }

        Queue<int[]> queue=new LinkedList<>();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (isW[i][j]==1){
                    res[i][j]=0;
                    queue.add(new int[]{i,j});
                }
            }
        }
        while (!queue.isEmpty()){
            int[] p=queue.poll();
            for (int[] dir:dirs){
                int x=p[0]+dir[0],y=p[1]+dir[1];
                if(x>=0&&x<m&&y>=0&&y<n&&res[x][y]==-1){
                    res[x][y]=res[p[0]][p[1]]+1;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return res;
    }

}
