package hot100;

public class num152 {
    public int max(int[] nums){
        if (nums.length==1) return nums[0];
        int res=0;
        int max=1;
        int min=1;
        for (int m:nums){
            int pre=max;
            max=Math.max(Math.max(max*m,m),min*m);
            min=Math.min(Math.min(min*m,m),pre*m);
            res=Math.max(max,res);
        }
        return res;
    }

    public static void main(String[] args) {
        num152 num152=new num152();
        num152.max(new int[]{2,3,-2,4});
    }
}
