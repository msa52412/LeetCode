package new1;

import java.util.LinkedList;
import java.util.Queue;

public class knightProbabilityInChessboard {
    public double knight(int n,int k,int row,int col){
        int[][] dir={{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
        double[][][] dp=new double[n][n][k+1];
        for (int i=0;i<n;i++){
            for (int m=0;m<n;m++){
                dp[i][m][0]=1;
            }
        }
        for (int p=1;p<=k;p++){
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    for (int[] d:dir){
                        int dx=d[0]+i,dy=d[1]+j;
                        if (dx<0||dx>=n||dy<0||dy>=n) continue;
                        dp[i][j][p]+=dp[dx][dy][p-1]/8;
                    }
                }
            }
        }
        return dp[row][col][k];


    }
}
