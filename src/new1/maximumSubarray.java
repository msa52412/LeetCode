package new1;

public class maximumSubarray {
    public int maxArray(int[] num){
        int n=num.length;
        int eve=0,max=0;
        for (int i=0;i<n;i++){
            eve=Math.max(eve+num[i],num[i]);
            max=Math.max(eve,max);
        }
        return max;
    }
}
