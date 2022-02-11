package new1;

import java.util.Arrays;

public class minimumDifferenceBetweenHighestAndLowestOfKScores {
    public static int minDiff(int[] num,int k){
        quickSort sort=new  quickSort(num);
        sort.sort(0,num.length-1);
        int[] sortnum=sort.getRes();
        Arrays.sort(num);
        int r=num.length-1;
        int l=r-k+1;
        int res=Integer.MAX_VALUE;
        while (l>=0){
            res=Math.min(res,num[r]-num[l]);
            r--;
            l--;
        }
        return res;
    }
    public static void main(String [] ad){
        int[] a={9,4,1,7};
        System.out.println(minDiff(a,2));
    }
}
