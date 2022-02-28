package new1;

public class optimalDivision {
    public String opt(int[] nums){
        if (nums.length==1) return String.valueOf(nums[0]);
        if (nums.length==2) return String.valueOf(nums[0])+"/"+String.valueOf(nums[1]);
        StringBuilder s=new StringBuilder();
        s.append(nums[0]);
        s.append("/(");
        s.append(nums[1]);
        for (int i=2;i<nums.length;i++){
            s.append("/");
            s.append(nums[i]);
        }
        s.append(")");
        return s.toString();
    }
}
