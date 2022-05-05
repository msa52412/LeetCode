package hot100;

import java.util.Stack;

public class num221 {
    public int max(char[][] mat){
        left=new int[mat.length][mat[0].length];
        build(mat);
        int res=0;
        Stack<Integer> stack=new Stack<>();
        for (int j=0;j<mat[0].length;j++){
            stack.clear();
            int[] top=new int[mat.length];
            for (int i=0;i<mat.length;i++){
                while (!stack.isEmpty()&&left[stack.peek()][j]>=left[i][j]) stack.pop();
                top[i]=stack.isEmpty()?0:stack.peek()+1;
                stack.add(i);
            }
            int[] bottom=new int[mat.length];
            stack.clear();
            for (int i=mat.length-1;i>=0;i--){
                while (!stack.isEmpty()&&left[stack.peek()][j]>=left[i][j]) stack.pop();
                bottom[i]=stack.isEmpty()?mat.length-1:stack.peek()-1;
                stack.add(i);
            }
            for (int i=0;i<mat.length;i++){
                int len1=bottom[i]-top[i]+1;
                int len2=left[i][j];
               int len=Math.min(len1,len2);
                res=Math.max(res,len*len);
            }
        }
        return res;
    }
    int[][] left;
    public void build(char[][] mat){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]=='1') left[i][j]=(j==0?0:left[i][j])+1;
            }
        }
    }
    public int maxmat(char[][] mat){
        int max=0;
        if (mat==null||mat.length==0||mat[0].length==0) return 0;
        int[][] dp=new int[mat.length][mat[0].length];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]=='1'){
                    if (i==0||j==0){
                        dp[i][j]=1;
                    }
                    else {
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                    }
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
