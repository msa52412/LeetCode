package hot100;

public class num238 {
    public int[] pro(int[] nums){
        int[] pre=new int[nums.length];
        int[] last=new int[nums.length];
        int preeve=1,lasteve=1;
        for (int i=0;i<nums.length;i++){
            pre[i]=preeve;
            preeve*=nums[i];
            last[nums.length-i-1]=lasteve;
            lasteve*=nums[nums.length-i-1];
        }
        int[] res=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            res[i]=pre[i]*last[i];
        }
        return res;
    }
    public int[] pron(int[] nums){
        int[] res=new int[nums.length];
        res[0]=1;
        for (int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int sum=1;
        for (int i=nums.length-1;i>-1;i--){
            res[i]*=sum;
            sum*=nums[i];
        }
        return res;
    }
}
