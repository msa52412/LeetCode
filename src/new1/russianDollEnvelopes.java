package new1;

import java.util.Arrays;
import java.util.Comparator;

public class russianDollEnvelopes {
    public static int max(int[][] en){
        Arrays.sort(en, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
            }
        });
        int[] top=new int[en.length];
        int p=0;

        for (int i=0;i<en.length;i++){
            int poker=en[i][1];

            int l=0,r=p;
            while (l<r){
                int mid=(r+l)/2;
                if (top[mid]>=poker) r=mid;
                else l=mid+1;

            }
            if (l==p) p++;
            top[l]=poker;
        }

        return p;
    }
    public static void main(String[] a){
        System.out.print(max(new int[][]{{5,4},{6,4},{6,7},{2,3}}));
    }
}
