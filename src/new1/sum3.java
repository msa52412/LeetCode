package new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {
    public List<List<Integer>> threesum(int[] num){
        int n=num.length;
        Arrays.sort(num);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for (int i=0;i<n;i++){
            if (i>0&&num[i]==num[i-1]) continue;
            int j=n-1;
            int tar=-num[i];
            for (int k=i+1;k<n;k++){
                if (k>i+1&&num[k]==num[k-1]) continue;
                while (k<j&&num[j]+num[k]>tar){
                    j--;
                }
                if (j==k) break;
                if (num[j]+num[k]==tar){
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[k]);
                    list.add(num[j]);
                    res.add(list);
                }
            }
        }
        return res;
    }

}
