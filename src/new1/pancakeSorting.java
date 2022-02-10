package new1;

import java.util.LinkedList;
import java.util.List;

public class pancakeSorting {
    public LinkedList<Integer> res=new LinkedList<>();
    public List<Integer> pancake(int[] cakes){
        sort(cakes,cakes.length);
        return res;
    }
    public void sort(int[] cakes,int n){
        if (n==1) return;
        int max=0,maxid=0;
        for (int i=0;i<n;i++){
            if (cakes[i]>max){
                max=cakes[i];
                maxid=i;
            }
        }
        reverse(cakes,0,maxid);
        res.add(maxid+1);
        reverse(cakes,0,n-1);
        res.add(n);
        sort(cakes,n-1);
    }
    public void reverse(int[] arr,int i,int j){
        while (i<j){
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
    }

}
