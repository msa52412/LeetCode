package Sword;

public class swordToOffer19 {
    public static boolean is(String s){
        if (s.length()==1) return true;
        if (s.length()==2) return true;
        char[] s1=s.toCharArray();
        int tmp1=0,tmp2=0;
        boolean flag=true;
        boolean last=true;
        for (int i=0,j=s1.length-1;i<=j;i++,j--){
            if (s1[i]!=s1[j]) {
                if (flag){
                    tmp1=i;
                    tmp2=j;
                    i++;
                    if (s1[i]!=s1[j]) last=false;
                    flag=false;
                }
                else {
                    last=false;
                    break;
                }
            }
        }
        boolean f=true;
        for (int i=tmp1,j=tmp2-1;i<=j;i++,j--){
            if (s1[i]!=s1[j]) {
                f=false;
                break;
            }
        }
        if (last) return true;
        return f;
    }

    public static void main(String[] args) {
        is("abc");
    }
}
