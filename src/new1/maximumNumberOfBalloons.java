package new1;

import java.util.HashMap;

public class maximumNumberOfBalloons {
    public int maxNum(String s){
       int[] num=new int[5];
       for (char c:s.toCharArray()){
           if (c=='b') num[0]++;
           else if (c=='a') num[1]++;
           else if (c=='l') num[2]++;
           else if (c=='o') num[3]++;
           else if (c=='n') num[4]++;
       }
       int res=Integer.MAX_VALUE;
       num[2]/=2;
       num[3]/=2;
       for (int i:num) res=Math.min(i,res);
        return res;
    }
}
