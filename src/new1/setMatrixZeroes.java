package new1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class setMatrixZeroes {
    public void setZero(int[][] mat){
        int m=mat.length,n=mat[0].length;
        boolean row=false,col=false;
        for (int k=0;k<n;k++){
            if (mat[0][k]==0)
            {
                row=true;
                break;
            }
        }
        for (int k=0;k<m;k++){
            if (mat[k][0]==0)
            {
                col=true;
                break;
            }
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;

                }
            }
        }
        for (int i=1;i<m;i++){
            if (mat[i][0]==0){
                for (int k=1;k<n;k++) mat[i][k]=0;
            }
        }
        for (int i=1;i<n;i++){
            if (mat[0][i]==0) {
                for (int k=1;k<m;k++) mat[k][i]=0;
            }
        }
        if (row) for (int i=0;i<n;i++) mat[0][i]=0;
        if (col) for (int i=0;i<m;i++) mat[i][0]=0;

    }


}
