package new1;

public class mergesort {
    public static void merge(int[] arr,int l,int m,int r,int[] tmp){
        int i=0,j=l,k=m+1;
        while (j<=m&&k<=r){
            if (arr[j]<arr[k]){
                tmp[i++]=arr[j++];
            }
            else {
                tmp[i++]=arr[k++];
            }
        }
        while (j<=m){
            tmp[i++]=arr[j++];
        }
        while (k<=r){
            tmp[i++]=arr[k++];
        }
        for (int p=0;p<i;p++){
            arr[l+p]=tmp[p];
        }
    }
    public static void mergesort(int[] arr,int l,int r,int[] tmp){
        if (l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid,tmp);
            mergesort(arr,mid+1,r,tmp);
            merge(arr,l,mid,r,tmp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];
        mergesort(arr,0,arr.length-1,tmp);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
