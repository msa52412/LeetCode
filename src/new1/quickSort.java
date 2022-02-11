package new1;

public class quickSort {
    private int[] num;
    public quickSort(int[] num){
        this.num=num;
    }

    public int getmid(int l,int r){
        int mid=num[l];
        while (l<r){
            while (num[r]>mid&&l<r) r--;
            num[l]=num[r];
            while (num[l]<mid&&l<r) l++;
            num[r]=num[l];
        }
        num[l]=mid;
        return l;
    }
    public void sort(int l,int r){
        if (l<r){
            int mid=getmid(l,r);
            sort(l,mid-1);
            sort(mid+1,r);

        }
    }
    public int[] getRes(){
        return num;
    }
}
