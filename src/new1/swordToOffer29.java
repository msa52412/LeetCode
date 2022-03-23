package new1;

import java.util.Arrays;

public class swordToOffer29 {
    static int[] res;
    static int len;
    static int alllen;
    public static int[] spr(int[][] mar){
        if (mar.length==0) return new int[]{};
        int m= mar.length,n=mar[0].length;
        len=0;
        res=new int[m*n];
        alllen=m*n;
        for (int i=0;i<=m/2;i++){
            pr(mar,i);
        }
        return res;
    }
    public static void pr(int[][] mar,int p){
        for (int i=p;i<=mar[0].length-p-1;i++){
            if (len==alllen) return;
           res[len]=mar[p][i];
           len++;

        }
        for (int i=p+1;i<mar.length-p-1;i++){
            if (len==alllen) return;
            res[len]=mar[i][mar[0].length-p-1];
            len++;

        }
        for (int i=mar[0].length-p-1;i>p;i--){
            if (len==alllen) return;
            res[len]=mar[mar.length-p-1][i];
            len++;

        }
        for (int i=mar.length-p-1;i>p;i--){
            if (len==alllen) return;
            res[len]=mar[i][p];
            len++;

        }
        return;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(spr(new int[][]{{2,5,8},{4,0,-1}})));
    }
}
