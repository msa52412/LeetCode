package new1;

public class validSudoku {
    public boolean isValid(char[][] board){
        int[][] row=new int[9][9];
        int[][] col=new int[9][9];
        int[][][] blo=new int[3][3][9];
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                int eve=board[i][j]-'1';
                if (eve>=0){
                    row[i][eve]+=1;
                    col[j][eve]+=1;
                    blo[i/3][j/3][eve]+=1;
                    if (row[i][eve]>1||col[j][eve]>1||blo[i/3][j/3][eve]>1) return false;
                }
            }
        }
        return true;
    }
}
