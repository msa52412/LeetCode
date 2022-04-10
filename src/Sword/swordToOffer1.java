package Sword;

public class swordToOffer1 {
    public int div(int a,int b){
        boolean flag=true;
        if (a>0){
            flag=false;
            a=-a;
        }
        if (b>0){
            flag=!flag;
            b=-b;
        }
        int res=0;
        while (a<=b){
            int n=1;
            while (true){
                int c=a>>n;
                if (c>=b){
                    res+=Math.pow(2,n-1);
                    a=a-(b<<(n-1));
                    break;
                }
                n++;
            }
        }
        return flag?(res==Integer.MIN_VALUE?Integer.MAX_VALUE:-res):res;
    }
}
