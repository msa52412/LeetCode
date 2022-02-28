package new1;

public class xoh6Oh {
    public int divn(int a,int b){
        boolean r=true;
        if (a>0){
            a=-a;
            r=false;
        }
        if (b>0) {
            b=-b;
            r=!r;
        }
        int res=0;
        while (a<=b){
            int n=1;
            while (true){
                int compare=a>>n;
                if (compare>=b){
                    res-=(int)Math.pow(2,n-1);
                    a=a-(b<<(n-1));
                    break;
                }
                n++;
            }
        }
    return r?(res==Integer.MIN_VALUE?Integer.MAX_VALUE:-res):res;

    }
    public int div(int a,int b){
        if (a==0) return 0;
        if (a==Integer.MIN_VALUE&&b==-1) return Integer.MAX_VALUE;
        int res=0;
        if (a<0&&b>0){
            while (a<=-b){
                a+=b;
                res++;
            }
            return -res;
        }
        if (a<0&&b<0){
            while (a<=b){
                a-=b;
                res++;
            }
            return res;
        }
        if (a>0&&b<0){
            while (a>=-b){
                a+=b;
                res++;
            }
            return -res;
        }

        while (a>=b){
            a-=b;
            res++;
        }
        return res;
    }
}
