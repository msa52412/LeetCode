package new1;

public class MaxWater {
    public static int getnum(int[] num){
        int a=num.length;
        int left=0,right=a-1;
        int area,max = 0;
        while (left<right){
            area=Math.min(num[left],num[right])*(right-left);

            max=Math.max(area,max);
            if (num[left]<num[right]){
                left+=1;
            }
            else {
                right-=1;
            }
        }
        return max;
    }
    public static void main(String[] a){
        int[] t={1,8,6,2,5,4,8,3,7};
        System.out.print(getnum(t));
    }
}
