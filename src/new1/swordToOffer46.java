package new1;

public class swordToOffer46 {
    static char[] m;
    static int res;
    public static int tran(int num){
        m=String.valueOf(num).toCharArray();
        res=0;
        dfs(0);
        return res;
    }
    public static void dfs(int p){
        if (p==m.length){
            res++;
            return;
        }
        dfs(p+1);
        if (p<m.length-1){
            int k=(m[p]-'0')*10+m[p+1]-'0';
            if (k<26&&k>9)  dfs(p+2);
        }
    }

    public static void main(String[] args) {
        System.out.println(tran(506));
    }
}
