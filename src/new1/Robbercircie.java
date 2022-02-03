package new1;

import java.util.ArrayList;
import java.util.Arrays;

public class Robbercircie {

    static int getcircle(int[] a){

        int all=a.length-1;
        if(all==0) return a[0];
        if(all==1) return Math.max(a[0],a[1]);
        int dp_0=0,dp_1=a[0],max1=-1;
        for(int i=2;i<=all;i++){
            max1=Math.max(dp_1,dp_0+a[i-1]);
            dp_0=dp_1;
            dp_1=max1;

        }
        all+=1;
        dp_0=0;
        dp_1=a[1];
        int max2=-1;
        for(int i=3;i<=all;i++){
            max2=Math.max(dp_1,dp_0+a[i-1]);
            dp_0=dp_1;
            dp_1=max2;

        }
        return Math.max(max1,max2);

    }
    public static void main(String [] wea){
        int num[]={2,7,9,3,1};
        System.out.print(getcircle(num));
    }
}
