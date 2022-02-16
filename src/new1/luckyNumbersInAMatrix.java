package new1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class luckyNumbersInAMatrix {
    public List<Integer> luck(int[][] num){
        List<Integer> res=new LinkedList<>();
        int[] col=new int[num.length],row=new int[num[0].length];
        for (int i=0;i< num.length;i++){
            int min=Integer.MAX_VALUE;
            for (int j=0;j<num[0].length;j++){
                row[j]=Math.max(row[j],num[i][j]);
                min=Math.min(min,num[i][j]);
            }
            col[i]=min;
        }
        for (int k:col){
            for (int v:row)
                if (k==v) res.add(k);
        }
        return res;
    }
}
