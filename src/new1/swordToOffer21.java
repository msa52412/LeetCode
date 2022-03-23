package new1;

public class swordToOffer21 {
    public static int[] ex(int[] num){
        int l=0,r=num.length-1;
        if (r%2==1){
        while (l<r-1){
            while (num[l]%2==1) {
                if (l== num.length-1)break;
                l++;
            }
            while (num[r]%2==0){
                if (r==0)break;
                r--;
            }
            if (l>=r) break;
           int last=num[l];
           num[l]=num[r];;
           num[r]=last;
        }
        }
        else {
            while (l<=r){
                while (num[l]%2==1) {
                    if (l== num.length-1)break;
                    l++;
                }
                while (num[r]%2==0){
                    if (r==0)break;
                    r--;
                }
                if (l>=r) break;
                int last=num[l];
                num[l]=num[r];;
                num[r]=last;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        ex(new int[]{1,3,5});
    }
}
