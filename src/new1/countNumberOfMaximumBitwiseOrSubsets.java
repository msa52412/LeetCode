package new1;

public class countNumberOfMaximumBitwiseOrSubsets {
    public int count(int[] nums){
        int n=nums.length,mask=1<<n;
        int max=0,res=0;
        for (int s=0;s<mask;s++){
            int cur=0;
            for (int i=0;i<n;i++){
                if (((s>>i)&1)==1) cur|=nums[i];
            }
            if (cur>max){
                max=cur;
                res=1;
            }
            else if (cur==max) res++;
        }
        return res;
    }
    int[] nums;
    int max,res;
    public int cou(int[] nums){
        this.nums=nums;
        this.max=0;
        this.res=0;
        dfs(0,0);
        return res;
    }
    public void dfs(int p,int val){
        if (p==nums.length){
            if (val>max){
                max=val;
                res=1;
            }
            else if (val==max) res++;
            return;
        }
        dfs(p+1,val|nums[p]);
        dfs(p+1,val);
    }


}
