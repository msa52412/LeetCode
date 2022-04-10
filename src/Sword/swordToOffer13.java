package Sword;

public class swordToOffer13 {
    int[][] pre;
    public swordToOffer13(int[][] mar){
        pre=new int[mar.length][mar[0].length];
        int sum=0;
        for (int i=0;i<mar.length;i++){
            sum+=mar[i][0];
            pre[i][0]=sum;
        }
        sum=0;
        for (int i=0;i<mar[0].length;i++){
            sum+=mar[0][i];
            pre[0][i]=sum;
        }
        for (int i=1;i<mar.length;i++){
            for (int j=1;j<mar[0].length;j++){
                pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+mar[i][j];
            }
        }
    }
    public int sum(int r1,int c1,int r2,int c2){
        if (r1==0){
            if (c1==0){
                return pre[r2][c2];
            }
            else return pre[r2][c2]-pre[r2][c1-1];
        }
        else {
            if (c1==0) return pre[r2][c2]-pre[r1-1][c2];
            else return pre[r2][c2]+pre[r1-1][c1-1]-pre[r2][c1-1]-pre[r1-1][c2];
        }
    }

    public static void main(String[] args) {
        swordToOffer13 s=new swordToOffer13(new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,1}});
        s.sum(1,1,2,2);
    }
}
