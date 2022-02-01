package new1;

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

}
