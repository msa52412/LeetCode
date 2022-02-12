package new1;

public class numberOfEnclaves {
    private static int[][] gridc;
    public static int numEn(int[][] grid){
        int res=0;
        gridc=grid;
        for (int i=0;i<grid.length;i++){
            search(i,0);
            search(i,grid[0].length-1);
        }
        for (int j=0;j<grid[0].length;j++){
            search(0,j);
            search(grid.length-1,j);
        }
        for (int i=1;i<grid.length-1;i++){
            for (int j=1;j<grid[0].length-1;j++){
                    if (grid[i][j]==1) res+=1;
            }
        }
        return res;
    }
    public static void search(int i,int j){
        if (gridc[i][j]==0) return;
        if (gridc[i][j]==1) gridc[i][j]=0;

       if (i-1>0) search(i-1,j);
       if (i+1< gridc.length) search(i+1,j);
       if (j+1<gridc[0].length) search(i,j+1);
       if (j-1>0) search(i,j-1);
    }
    public static void main(String[] e){
        int[][] a={{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        System.out.println(numEn(a));
    }
}
