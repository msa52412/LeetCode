package new1;

public class palindromicSubstrings {
    public int count(String s){
        int res=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (is(s,i,j)) res++;
            }
        }
        return res;
    }
    public boolean is(String s,int st,int e){
        while (st<e){
            if (s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
    public int count1(String s){
        int n=s.length();
        int res=0;
        for (int i=0;i<2*n-1;i++){
            int l=i/2,r=i/2+i%2;
            while (l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
                res++;
            }
        }
        return res;
    }
    public String countmax(String s){
        int n=s.length();
        int res=0;
        String str=new String();
        for (int i=0;i<2*n-1;i++){
            int l=i/2,r=i/2+i%2;
            while (l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                if (res<r-l+1){
                    res=r-l+1;
                    str=s.substring(l,r+1);
                }
                l--;
                r++;

            }
        }
        return str;
    }

}
