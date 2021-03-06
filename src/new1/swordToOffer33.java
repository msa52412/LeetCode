package new1;

import java.util.*;

public class swordToOffer33 {
    int end;
    public boolean is(int[] pre){
        end=pre.length-1;
        search(pre,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return end<0;
    }
    public void search(int[] pre,int min,int max){
        if (end<0) return;
        int root=pre[end];
        if (root>=max||root<=min) return;
        end--;
        search(pre,root,max);
        search(pre,min,root);
    }
    public static int call(String[] str){
        int res=0;
        int[] arr=new int[str.length];
        int i=0;
        for(String s:str){
            if (Objects.equals(s, "+")){
                arr[i]=arr[i-1]+arr[i-2];
                i++;
                continue;
            }
            else if (Objects.equals(s, "D")){
                arr[i]=arr[i-1]*2;
                i++;
                continue;
            }
            else if (Objects.equals(s, "C")){
                arr[i-1]=0;
                i--;
                continue;
            }
            arr[i]=Integer.parseInt(s);
            i++;
        }
        for (int m:arr) res+=m;
        return res;
    }

    public static void main(String[] args) {
        call(new String[]{"5","2","C","D","+"});
    }
    public List<Integer> get(int l, int r){
        List<Integer> res=new ArrayList<>();
        for (int i=l;i<=r;i++){
            if (is(i)) res.add(i);
        }
        return res;
    }
    public boolean is(int m){
        int k=m;
        while (k>0){
            if (k%10==0||m%(k%10)!=0) return false;
            k/=10;
        }
        return true;
    }
}
