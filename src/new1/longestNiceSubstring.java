package new1;

public class longestNiceSubstring {
    private int l,rl;
    public String getLong(String s){
      this.l=0;
      this.rl=0;
      dfs(s,0,s.length()-1);
      return s.substring(l,l+rl);

    }
    public void dfs(String s,int left,int right){
        if (left>=right) return;
        int low=0,up=0;
        for (int i=left;i<=right;i++){
            if (Character.isLowerCase(s.charAt(i))){
                low|=1<<(s.charAt(i)-'a');
            }
            else {
                up|=1<<(s.charAt(i)-'a');
            }
        }
        if (low==up){
            if (right-left+1>rl){
                l=left;
                rl=right-left+1;
            }
            return;
        }
        int val=low&up;
        int p=left;
        while (p<=right){
            left=p;
            while (p<=right&&(val&(1<<Character.toLowerCase(s.charAt(p))-'a'))!=0){
                    p++;
            }
            dfs(s,left,p-1);
            p++;
        }
    }

}
