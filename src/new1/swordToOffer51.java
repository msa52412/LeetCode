package new1;

public class swordToOffer51 {
    int reverse(int[] nums){
        int res=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]) res++;
            }
        }
        return res;
    }
    int[] nums,tmp;
    int reverseWithMerge(int[] nums){
        this.nums=nums;
        this.tmp=new int[nums.length];
        return merge(0,nums.length-1);
    }
    int merge(int l,int r){
        if (l>=r) return 0;
        int m=(l+r)/2;
        int res=merge(l,m)+merge(m+1,r);//分治左右
        int i=l,j=m+1;
        for (int k=l;k<=r;k++){//复制到临时数组
            tmp[k]=nums[k];
        }
        for (int k=l;k<=r;k++){
            if (i==m+1){//左数组完毕
                nums[k]=tmp[j++];
            }
            else if (j==r+1||tmp[i]<=tmp[j]){//右数组完毕/不满足逆序条件
                nums[k]=tmp[i++];
            }
            else {//满足逆序条件
                nums[k]=tmp[j++];
                res+=m-i+1;//核心是总体大小趋势没变
            }
        }
        return res;
    }
}
