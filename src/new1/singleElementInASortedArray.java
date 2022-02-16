package new1;

public class singleElementInASortedArray {
    public int single(int[] num){
        int n=num.length;
        if (n==1||num[0]!=num[1]) return num[0];
        if (num[n-1]!=num[n-2]) return num[n-1];
        int s=2,e=n-3;
        while (s<e){
            int mid=(s+e)/2;
            if (mid%2==0&&num[mid]==num[mid+1]){
                s=mid+2;
            }
            else if (mid%2==1&&num[mid]==num[mid-1]){
                s=mid+1;
            }
            else if (mid%2==0&&num[mid]==num[mid-1]){
                e=mid-2;
            }
            else if (mid%2==1&&num[mid]==num[mid+1]){
                e=mid-1;
            }
            else {
                s=mid;
                break;
            }
        }
        return num[s];
    }

}
