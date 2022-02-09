package new1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class intersectionOfTwoArraysIi {
    public static int[] inter(int[] num1,int[] num2){
        if (num1.length>num2.length) return inter(num2,num1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:num1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] re=new int[num1.length];
        int id=0;
        for (int i:num2){
           int cou=map.getOrDefault(i,0);
           if (cou>0){
               re[id]=i;
               id++;
               cou--;
               if (cou>0){
                   map.put(i,cou);
               }
               else {
                   map.remove(i);
               }
           }
        }
        return Arrays.copyOfRange(re,0,id);

    }
    public static void main(String [] a){
        int[] num1={1,2,2,1},num2={2,2};
        for (int k:inter(num1,num2)){
            System.out.println(k);
        }
    }
}
