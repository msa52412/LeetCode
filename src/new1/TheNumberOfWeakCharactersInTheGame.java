package new1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TheNumberOfWeakCharactersInTheGame {
    public static int getnum(int[][] pro){
        Arrays.sort(pro, (o1,o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);

        int res=0,max=Integer.MIN_VALUE;
        for (int i=0;i<pro.length;i++){
            if(max>pro[i][1]){
                res+=1;

            }
            max=Math.max(max,pro[i][1]);

        }
        return res;

    }
    public static void main(String[] a){
        int[][] nums=new int[][]{{1,1},{2,1},{2,2},{1,2}};
        System.out.println(getnum(nums));
    }


}
