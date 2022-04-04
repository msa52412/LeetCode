package new1;

public class swordToOffer47 {
    public int max(int[][] grid){

        int dp[][]=new int[grid.length][grid[0].length];
       int cou=0;
        for (int i=0;i<grid.length;i++){
           cou+=grid[i][0];
            dp[i][0]=cou;
       }
         cou=0;
        for (int i=0;i<grid[0].length;i++){
            cou+=grid[0][i];
            dp[0][i]=cou;
        }
        for (int i=1;i<grid.length;i++){
            for (int j=1;j<grid[0].length;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
