package new1;

public class maximizeTheConfusionOfAnExam {
    public static int maxcount(String a,int k){
        char[] c=a.toCharArray();
        int T=0,F=0;
        int res=0;
        int l=0,r=0;
        while (r<=c.length){
            while (T>k){
                if (c[l]=='T') T--;
                else F--;
                l++;
            }
            res=Math.max(T+F,res);
            if (r==c.length) break;
            if (c[r]=='T') T++;
            else F++;
            r++;

        }
        T=0;
        F=0;
        l=0;
        r=0;
        while (r<=c.length){
            while (F>k){
                if (c[l]=='T') T--;
                else F--;
                l++;
            }
            res=Math.max(T+F,res);
            if (r==c.length) break;
            if (c[r]=='T') T++;
            else F++;
            r++;

        }
        return res;
    }

    public static void main(String[] args) {
        maxcount("TTFF",2);
    }
}
