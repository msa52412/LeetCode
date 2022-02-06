package new1;

public class sumOfUniqueElements {
    public int sum(int[] all){
        int[] sums=new int[101];
        int res=0;
        for (int i:all){
            sums[i]++;
            if (sums[i]==1){
                res+=i;
            }
            else if (sums[i]==2){
                res-=i;

            }
        }
        return res;
    }

}
