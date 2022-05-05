package hot100;

public class num283 {
    public void move(int[] nums){
        int i=0,j=0;
        while (j<nums.length){
            if (nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            j++;
        }
    }

    public void swap(int[] nums,int i,int j){
        int m=nums[i];
        nums[i]=nums[j];
        nums[j]=m;
    }
}
