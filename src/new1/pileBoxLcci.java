package new1;

import java.util.Arrays;
import java.util.Comparator;

public class pileBoxLcci {
    public int pile(int[][] box){
        if (box.length==0) return 0;
        Arrays.sort(box, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[2]==b[2]?(a[0]==b[0]?b[1]-a[1]:b[0]-a[0]):b[2]-a[2];
            }
        });
        int[] dp=new int[box.length];
        dp[0]=box[0][2];
        int max=dp[0];
        for (int i=1;i<box.length;i++){
            dp[i]=box[i][2];
            for (int j=0;j<i;j++){
                if (box[i][0]<box[j][0]&&box[i][1]<box[j][1]&&box[i][2]<box[j][2]){
                    dp[i]=Math.max(dp[i],dp[j]+box[i][2]);
                }
                max=Math.max(max,dp[i]);
            }
        }
        return max;
    }
}
