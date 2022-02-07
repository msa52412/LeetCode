package new1;

import java.util.Arrays;

public class mergeSortedArray {
    public void merge(int[] n1,int n,int[] m1,int m){
        int np=0,mp=0;
        int curr;
        int[] res=new int[m+n];
        while (np<n||mp<m){
            if (np==n){
                curr=m1[mp];
                mp+=1;
            }
           else if (mp==m){
                curr=n1[np];
                np+=1;
            }
           else if (n1[np]<=m1[mp]){
                curr=n1[np];
                np+=1;
            }
           else {
               curr=m1[mp];
               mp+=1;
            }
            res[np+mp-1]=curr;

        }
        for (int i=0;i<m+n;i++){
            n1[i]=res[i];
        }
    }

}
