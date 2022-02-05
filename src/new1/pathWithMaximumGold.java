package new1;

public class pathWithMaximumGold {
    int ans=0;
    int grid[][];
    public int getMax(int[][] grid){
        this.grid=grid;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0) getGold(i,j,0);
            }
        }
        return ans;
    }
    public void getGold(int i,int j,int gold){
        if (i==-1||j==-1||i==grid.length||j==grid[0].length||grid[i][j]==0) return ;
        int g=grid[i][j];
        gold+=g;
        grid[i][j]=0;
        ans=Math.max(ans,gold);
        getGold(i+1,j,gold);
        getGold(i-1,j,gold);
        getGold(i,j+1,gold);
        getGold(i,j-1,gold);
        grid[i][j]=g;
    }

}
