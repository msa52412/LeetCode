package hot100;

import java.util.*;

public class num200 {
    public int num(char[][] grid){
        this.grid=grid;
        has=new boolean[grid.length][grid[0].length];
        res=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'&&!has[i][j]) {
                    res++;
                    bfs(i,j);
                }
            }
        }
        return res;
    }
    boolean[][] has;
    char[][] grid;
    int res;
    public void bfs(int i,int j){
        if (has[i][j]||grid[i][j]=='0') return;
        has[i][j]=true;
        if (i+1<grid.length&&!has[i+1][j]) bfs(i+1,j);
        if (i-1>-1&&!has[i-1][j]) bfs(i-1,j);
        if (j+1<grid[0].length&&!has[i][j+1]) bfs(i,j+1);
        if (j-1>-1&&!has[i][j-1]) bfs(i,j-1);
    }
}
