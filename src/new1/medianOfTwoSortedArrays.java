package new1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class medianOfTwoSortedArrays {
    public static double find(int[] n1,int[] n2){
        int s1=n1.length,s2=n2.length;
        if ((s1+s2)%2==0) {
            int p=(s1+s2)/2;
            int fir=0,sec=0;
            int res1=0,res2=0;
            while (fir+sec<p){
                res1=res2;
                if (n1[fir]<n2[sec]&&fir<s1-1){
                    fir++;
                    res2=n1[fir];
                }
                else if (sec<s2-1) {
                    sec++;
                    res2=n2[sec];
                }
            }
        return ((double) res1+(double)res2)/2;
        }

        else {
            if (s1+s2==3){
                int[] t=new int[3];
                t[0]=n1[0];
                if (s1==2){
                    t[1]=n1[1];
                }
                else {
                    t[1]=n2[1];
                }
                t[2]=n2[0];
                Arrays.sort(t);
                return t[1];

            }
            int p=(s1+s2)/2-1;
            int fir=0,sec=0;
            int res=0;
            while (fir+sec<p){
               while (fir<s1&&(n1[fir]<n2[sec]||sec==s2-1)&&fir+sec<=p) {
                   res=n1[fir];
                   if (fir==s1-1) break;
                   fir++;
                   System.out.println("fir"+fir);
               }
               while (sec<s2&&(n1[fir]>n2[sec]||fir==s1-1)&&fir+sec<=p){
                   res=n2[sec];
                   if (sec==s2-1) break;
                   sec++;
                   System.out.println("sec"+sec);
               }
            }
            return (double) res;
        }

    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2},new int[]{1,3,5,6,7,8}));//p  7/2-1  2
        System.out.println(find(new int[]{1,2,3},new int[]{4,5,6}));//5/2-1  1
    }

}
