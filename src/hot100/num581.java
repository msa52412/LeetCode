package hot100;

public class num581 {
    public int find(int[] nums){
        if (nums.length==1) return 0;
        int fir=0;
        int last=nums.length-1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>=nums[i-1]){
                fir++;
            }
            else break;
        }
        if (fir==nums.length-1) return 0;
        for (int i=nums.length-1;i>0;i--){
            if (nums[i]>=nums[i-1]){
                last--;
            }
            else break;
        }
        if (fir==0&&last==nums.length-1) return nums.length;
        int midMin=Integer.MAX_VALUE;
        int midMax=Integer.MIN_VALUE;
        for (int i=fir+1;i<last;i++){
            midMax=Math.max(midMax,nums[i]);
            midMin=Math.min(midMin,nums[i]);
        }
        if (midMax==Integer.MIN_VALUE){
            midMin=nums[last];
            midMax=nums[fir];
            fir--;
            last++;
        }
        if (last==nums.length-1){
            midMin=Math.min(midMin,nums[last]);
        }
        while (fir>-1&&midMin<nums[fir]){
            midMin=Math.min(midMin,nums[fir]);
            midMax=Math.max(midMax,nums[fir]);
            fir--;
        }
        while (last<nums.length&&midMax>nums[last]){
            midMax=Math.max(midMax,nums[last]);
            midMin=Math.min(midMin,nums[last]);
            last++;
        }
        while (fir>-1&&midMin<nums[fir]){
            midMin=Math.min(midMin,nums[fir]);
            midMax=Math.max(midMax,nums[fir]);
            fir--;
        }
        return last-fir-1;
    }

    public static void main(String[] args) {
        num581 num581=new num581();
        System.out.println(num581.find(new int[]{2,4,3,1,5}));
    }
}
