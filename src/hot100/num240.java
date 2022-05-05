package hot100;

public class num240 {
    public boolean search(int[][] mat,int tar){
        if (mat[0][0]>tar||mat[mat.length-1][mat[0].length-1]<tar) return false;
        if (mat[0][0]==tar||mat[0][mat[0].length-1]==tar) return true;
        int i=0,j=mat[0].length-1;
        while (tar!=mat[i][j]){
        while (i<mat.length&&mat[i][j]<tar) i++;
        if (i==mat.length) return false;
        if (mat[i][j]==tar) return true;
        while (j>-1&&mat[i][j]>tar) j--;
        if (j==-1) return false;
        if (mat[i][j]==tar) return true;
        }
        return false;
    }

}
