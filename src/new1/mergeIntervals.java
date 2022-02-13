package new1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;

public class mergeIntervals {
    public static int[][] merge(int[][] i){
        ArrayList<int[]> res=new ArrayList<>();
        Arrays.sort(i, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int s=i[0][0],e=i[0][1];
        for (int m=0;m<i.length;m++){
            e=Math.max(e,i[m][1]);
            if (m==i.length-1||i[m+1][0]>e){
                res.add(new int[]{s,e});
                if (m+1<i.length) s=i[m+1][0];
            }

        }
        int[][] re=new int[res.size()][2];
        return res.toArray(re);
    }
    public static void main(String[] a){
        int[][] e={{1,3},{8,10},{2,6},{15,18}};
        for(int[] l:merge(e)){
            System.out.println(l[0]);
            System.out.println(l[1]);
        }
    }
    public int[][] mergeBitSet(int[][] i){
        BitSet bit=new BitSet();//位图
        int max=0;
        for (int[] eve:i){//放入位图
            int tmp=eve[1]*2+1;//防止区间长度为0 {5，5}
            bit.set(eve[0]*2,tmp,true);//防止区间连续{1，3}{3，5} 放入bitset 区间之中全为true
            max=Math.max(max,tmp);//维护最大值后续循环
        }
        int index=0,count=0;
        while (index<max){
            int s=bit.nextSetBit(index);//取得上一个区间之后的第一位true
            int e=bit.nextClearBit(s);//取得第一位true之后的第一位false
            i[count++]=new int[]{s/2,(e-1)/2};//借助原数组存储结果
            index=e;//维护区间起点
        }
        int[][] res=new int[count][2];//建立结果数组
        for (int t=0;t<count;t++){
            res[t]=i[t];//复制到结果
        }
        return res;
    }
}
