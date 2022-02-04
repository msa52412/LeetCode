package new1;

import java.util.Comparator;
import java.util.TreeMap;

public class numberOfRectanglesThatCanFormTheLargestSquare {
    public static int count(int[][] r){
        int max=0;
        int every=0;
        int res=0;
        for (int[] l:r){
            every=Math.min(l[0],l[1]);
            if (every>max){
                res=1;
                max=every;
                continue;
            }
            else if(every==max){
                res+=1;
            }


        }
      return res;
    }
    public static void main(String[] a){
        int[][] num={{5,8},{3,9},{5,12}};
        System.out.print(count(num));
    }
}
