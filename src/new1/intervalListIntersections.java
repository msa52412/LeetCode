package new1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class intervalListIntersections {
    public static int[][] inter(int[][] fir,int[][] sen){
        BitSet bit1=new BitSet();
        BitSet bit2=new BitSet();
        int max=0,min=0;
        for (int[] i:fir){
            bit1.set(i[0]*2,i[1]*2+1,true);//防止区间长度为0 {5，5}防止区间连续{1，3}{3，5} 放入bitset 区间之中全为true
            max=Math.max(max,i[1]*2+1);
        }
        for (int[] i:sen){
            bit2.set(i[0]*2,i[1]*2+1,true);
            min=Math.max(min,i[1]*2+1);
        }
        max=Math.min(max,min);
        bit1.and(bit2);//与操作求交集
        ArrayList<int[]> res=new ArrayList<>();
        int index=0;
        while (index<max){
            int s=bit1.nextSetBit(index);//取得上一个区间之后的第一位true
            if(s<0) break;//s越界 break
            int e=bit1.nextClearBit(s);//取得第一位true之后的第一位false
            res.add(new int[]{s/2,(e-1)/2});
            index=e;//维护区间起点
        }
        int retu[][]=new int[res.size()][2];
        return res.toArray(retu);
    }
    public static void main(String[] a){
        for (int[] i:inter(new int[][]{{1,8},{16,20}},new int[][]{{2,11},{12,13}})){
            System.out.println(i[0]);
            System.out.println(i[1]);
        }
    }
    public int[][] inder1(int[][] fir,int[][] sec){
        int i=0,j=0;
        List<int[]> res=new ArrayList<>();
        while (i<fir.length&&j<sec.length){
            int a1=fir[i][0],a2=fir[i][1];
            int b1=sec[j][0],b2=sec[j][1];
            if (b2>=a1&&a2>=b1){
                res.add(new int[]{Math.max(a1,b1),Math.min(a2,b2)});
            }
            if (b2<a2) j++;
            else i++;
        }
        int[][] retu=new int[res.size()][2];
        return res.toArray(retu);
    }
}
