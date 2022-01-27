package new1;

import java.util.HashMap;

public class leetcode1 {
    public static int[] twoSum(int[] nums,int tar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length;i++){
            if(map.containsKey(tar-nums[i])){
                return new int[]{map.get(tar-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] aa){

        for(int i:twoSum(new int[]{2,7,11,15},9)){
            System.out.println(i);
        }
    }

}
