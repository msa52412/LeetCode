package new1;

import java.lang.reflect.Array;
import java.util.*;

public class leeet {


    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder res=new StringBuilder();
        char[] fir=s.toCharArray();
        for (int i=0;i<fir.length;i++){
            char c=fir[i];
            int len=1;
            while (i+1<fir.length&&fir[i+1]==c){
                i++;
                len++;
            }
            res.append(String.valueOf(len)+c);

        }
        System.out.println(res.toString());*/

        System.out.println(to7(-30));

    }
    public static String to7(int a){
        if (a==0) return "0";
        int flag=0;
        if (a<0) {
            flag=1;
            a=-a;
        }
        StringBuilder s=new StringBuilder();
        int i=0;
        int all=0;
        while (a>0){
            i=a%7;
            all=a/7;
            a=all;
            s.append(i);
        }
        if (flag==1) s.append('-');
        s.reverse();
        return s.toString();
    }
}