package new1;

public class searchInsertPosition {
    public static int search(int[] num,int t){
        int n=num.length;
        if (n==0) return 0;
        if (n==1) {
            if (num[0]==t) return 0;
            return num[0]<t?1:0;
        }
        if (num[n-1]<t) return n;
        if (num[0]>t) return 0;
        int l=0,r=n-1;
        while (l<r){
            int mid=(l+r)/2;
            if (num[mid]>t){
                r=mid-1;
            }
            else if (num[mid]<t){
                l=mid+1;
            }
            else break;
        }
        if (num[(l+r)/2]==t) return (l+r)/2;
        else {
            if (num[r]<t&&num[r+1]>t) return r+1;
            else return r;
        }
    }
    public static void main(String[] a){
        System.out.print(search(new int[]{1,3},3));
    }
}
