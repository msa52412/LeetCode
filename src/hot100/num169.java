package hot100;

public class num169 {
    public int major(int[] nums){
        int count=1;
        int now = nums[0];
        for (int i=1;i<nums.length;i++){
            if (now==nums[i]){
                count++;
            }
            else {
                count--;
                if (count==0) now=nums[i+1];
            }
        }
        return now;
    }
}
