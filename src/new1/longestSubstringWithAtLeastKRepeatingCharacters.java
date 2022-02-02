package new1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class longestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSub(String s,int k){
        return dfs(s,0,s.length()-1,k);
    }
    public int dfs (String s,int l,int r,int k){
        int[] num=new int[26];
        for (int i=l;i<=r;i++){
            num[s.charAt(i)-'a']+=1;
        }
        char split = 0;
        for (int i=0;i<26;i++){
            if(num[i]>0&&num[i]<k){
                split=(char) (i+'a');
                break;
            }
        }
        if(split==0){
            return r-l+1;
        }
        int i=l,res=0;
        while (i<=r){
            while (i<=r&&s.charAt(i)==split){
                i++;
            }
            if(i>r) break;
            int start=i;
            while (i<=r&&s.charAt(i)!=split){
                i++;
            }
            res=Math.max(res,dfs(s,start,i-1,k));
        }
        return res;
    }
    public int longest(String s,int k){
        int ans=0,n=s.length();
        char[] cs=s.toCharArray();
        int[] dir =new int[26];
        for (int p=1;p<27;p++){
            Arrays.fill(dir,0);
            for (int i=0,j=0,t=0,sum=0;i<n;i++){

                int u=cs[i]-'a';
                dir[u]+=1;
                if (dir[u]==1) t+=1;
                if (dir[u]==k) sum+=1;
                while (t>p){
                    int c=cs[j++]-'a';
                    dir[c]-=1;
                    if (dir[c]==0) t-=1;
                    if (dir[c]==k-1) sum-=1;
                }
                if (t==sum) ans=Math.max(ans,i-j+1);
            }
        }
        return ans;
    }

}
