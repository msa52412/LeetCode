package new1;

import java.util.PriorityQueue;
import java.util.Queue;

public class swordToOffer40 {
    //topk
    //计数
    public int[] ltopk(int[] arr,int k){
        int[] p=new int[10000];
        for (int m:arr){
            p[m]+=1;
        }
        int[] res=new int [k];
        for (int i=0,j=0;i<p.length&&k>0;i++){
            while (p[i]>0&&k>0){
                res[j]=i;
                p[i]--;
                j++;
                k--;
            }
        }
        return res;
    }
    //堆
    public int[] topk(int[] num,int k){
        if (k==0) return null;
        Queue<Integer> heap=new PriorityQueue<>(k,(i1,i2)->Integer.compare(i2,i1));
        for (int i:num){
            if (heap.isEmpty()||heap.size()<k||i<heap.peek()){
                heap.offer(i);
            }
            if (heap.size()>k) heap.poll();
        }
        int[] res=new int[k];
        int j=0;
        for (int i:heap){
            res[j++]=i;
        }
        return res;
    }
    //quicksort
    public int[] topkquick(int[] num,int k){
        if (k==0) return new int[]{};
        if (num.length<k) return num;
        parttok(num,0,num.length-1,k);
        int[] res=new int[k];
        for (int i=0;i<k;i++){
            res[i]=num[i];
        }
        return res;
    }
    void parttok(int[] num,int l,int r,int k){
        int m=part(num,l,r);
        if (k==m) return;
        else if(k<m) parttok(num,l,m-1,k);
        else {
            if (m<num.length-1) {
                parttok(num, m + 1, r, k);
            }
        }
    }
   int  part(int[] num,int l,int r){
        int p=num[l];
       while (l<r){
           while (l<r&&num[r]>=p) r--;
           num[l]=num[r];
           while (l<r&&num[l]<p) l++;
           num[r]=num[l];
       }
       num[l]=p;
       return l;
    }

}
