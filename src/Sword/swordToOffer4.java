package Sword;

public class swordToOffer4 {
    public int single(int[] nums){
        int[] p=new int[32];
        for (int i:nums){
            for (int j=0;j<32;j++){
                p[j]+=(i>>(31-j))&1;
            }
        }
        int res=0;
        for (int i=0;i<32;i++){
            res=(res<<1)+p[i]%3;
        }
        return res;
    }
}
