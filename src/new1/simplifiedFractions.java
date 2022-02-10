package new1;

import java.util.LinkedList;
import java.util.List;

public class simplifiedFractions {
        public static List<String> simple(int n){
                int i=2;
                List<String> res=new LinkedList<>();
                while (i<=n){
                        for (int k=1;k<i;k++){
                                if (isC(i,k)==1) {
                                        res.add(new String(k + "/" + i));
                                }
                        }
                        i++;
                }
                return res;
        }
        public static int isC(int i,int k){
             return k==0?i:isC(k,i%k);
        }
        public static void main(String [] a){

                System.out.println(simple(6));
        }
}
