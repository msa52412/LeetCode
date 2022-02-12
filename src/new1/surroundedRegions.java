package new1;

public class surroundedRegions {
    private char[][] b;
    private boolean[][] p;
    public void solve(char[][] board){
        b=board;
        p=new boolean[board.length][board[0].length];
        for (int i=0;i<board.length;i++){
            dfs(i,0);
            dfs(i,board[0].length-1);
        }
        for (int j=0;j<board[0].length;j++){
            dfs(0,j);
            dfs(board.length-1, j);
        }
        for (int i=1;i<board.length-1;i++){
            for (int j=1;j<board[0].length-1;j++){
                if (!p[i][j]) board[i][j]='X';
            }
        }
        return;
    }
    public void dfs(int i,int j){
        if (b[i][j]=='X') return;
        if (b[i][j]=='O') p[i][j]=true;
        if (i-1>0&&!p[i-1][j]) dfs(i-1,j);
        if (i+1< b.length&&!p[i+1][j]) dfs(i+1,j);
        if (j+1<b[0].length&&!p[i][j+1]) dfs(i,j+1);
        if (j-1>0&&!p[i][j-1]) dfs(i,j-1);
        
    }
}
