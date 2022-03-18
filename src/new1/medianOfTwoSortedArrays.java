package new1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class medianOfTwoSortedArrays {
    public static double find(int[] n1,int[] n2){
        int m=n1.length,n=n2.length;
        int len=m+n;
        int left=-1,right=-1;
        int a=0,b=0;
        for (int i=0;i<=len/2;i++){
            left=right;
            if (a<m&&(b>=n||n1[a]<n2[b])){
                right=n1[a++];
            }
            else right=n2[b++];
        }
        if (len%2==0) return (left+right)/2.0;
        else return right;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2},new int[]{1,3,5,6,7,8}));//p  7/2-1  2
        System.out.println(find(new int[]{1,2,3},new int[]{4,5,6}));//5/2-1  1
    }
   /* public double findfir(int[] n1,int[] n2){
        int ll=n1.length;
        int rl=n2.length;
        if (ll>rl){
            return findfir(n2,n1);
        }

    }*/
    public double findsec(int[] n1,int[] n2){
        int l1=n1.length,l2=n2.length;
        int all=l1+l2;
        if (all%2==1){
            int mid=all/2;
            double m=getK(n1,n2,mid+1);
            return m;
        }
        else {
            int mid=all/2-1,mid1=all/2;
            double m=(getK(n1,n2,mid+1)+getK(n1,n2,mid1+1))/2.0;
            return m;
        }
    }
    public int getK(int[] n1,int[] n2,int k){
        int l1=n1.length,l2=n2.length;
        int i1=0,i2=0;
        int key=0;
        while (true){
            if (i1==l1){
                return n2[i2+k-1];
            }
            if (i2==l2){
                return n1[i1+k-1];
            }
            if (k==1){
                return Math.min(n1[i1],n2[i2]);
            }
            int half=k/2;
            int newi1=Math.min(i1+half,l1)-1;
            int newi2=Math.min(i2+half,l2)-1;
            int p1=n1[newi1],p2=n2[newi2];
            if (p1<=p2){
                k-=(newi1-i1+1);
                i1=newi1+1;
            }
            else {
                k-=(newi2-i2+1);
                i2=newi2+1;
            }
        }
    }

}
