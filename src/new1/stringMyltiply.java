package new1;

import java.util.ArrayList;

public class stringMyltiply {
    public static String mut(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int[] res=new int[m+n];
        for (int j=m-1;j>=0;j--){
            int num1=s1.charAt(j)-'0';
            for (int i=n-1;i>=0;i--){
                int num2=s2.charAt(i)-'0';
                int sum=num2*num1+ res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder result=new StringBuilder();
        int i=0;
        for (;i<m+n-1;i++) if (res[i]!=0) break;

        for (;i<m+n;i++){
            result.append(res[i]);
        }
        return result.toString();

    }
    public static void main(String[] a){
        String s1="12",s2="456";
        System.out.println(mut(s1,s2));
    }

}
