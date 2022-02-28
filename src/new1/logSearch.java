package new1;

public class logSearch {
    public static int search(int[] arr,int i){
        int left=0;
        int rignt=arr.length-1;
        while (left<rignt){
            int mid=(rignt+left)/2;
            if (arr[mid]==i) rignt=mid;
            else if(arr[mid]>i) rignt=mid;
            else if (arr[mid]<i) left=mid+1;
        }
        return left;
    }
    public static void main(String[] a){
        int[] arr=new int[]{1,2,5,7,7,7,7,7,7,7,8,9,10};
        int num=7;
        System.out.println(search(arr,num));
    }
}
