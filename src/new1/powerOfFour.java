package new1;

public class powerOfFour {
    //4^n判断
    public boolean getp(int n){
        return n>0&&(n&(n-1))==0&&(n&0xaaaaaaaa)==0;
    }
    public boolean is4(int n){
        return n>0&&(n&(n-1))==0&&n%3==1;
    }
    //交替01
    public boolean is01(int n){
        int m=n^(n>>1);
        return (m&(m+1))==0;
    }
}
