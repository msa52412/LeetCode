package new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queen {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> soloveNQueen(int n){
        char[][] board=new char[n][n];
        for (char[] c:board){
            Arrays.fill(c,'.');
        }
        backtrack(board,0);
        return res;
    }
    public void backtrack(char[][] board,int row){
        if (row==board.length){
            res.add(charToList(board));
            return;
        }
        int n=board[row].length;
        for (int col=0;col<n;col++){
            if (!isValid(board,row,col)) continue;
            board[row][col]='Q';
            backtrack(board,row+1);
            board[row][col]='.';
        }
    }
    public boolean isValid(char[][] board,int row,int col){
        int n=board.length;
        for (int i=0;i<n;i++){
            if (board[i][col]=='Q') return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if (board[i][j]=='Q') return false;
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q') return false;
        }
        return true;
    }
    public List charToList(char[][] board){
        List<String> list=new ArrayList<>();
        for (char[] c:board){
            list.add(String.copyValueOf(c));
        }
        return list;
    }
}
