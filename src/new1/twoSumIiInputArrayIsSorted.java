package new1;

public class twoSumIiInputArrayIsSorted {
    public int[] twosum(int[] num,int tar){
        int left=0,right=num.length-1;
        while (left<right){
        if (num[left]+num[right]>tar){
                right--;
            }
            else if (num[left]+num[right]<tar){
                left++;
            }
            else return new int[]{left+1,right+1};
        }
        return new int[]{0,0};
    }
}
