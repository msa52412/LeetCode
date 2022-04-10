package Sword;

public class swordToOffer5 {
    public int max(String[] words){
        int[] p=new int[words.length];
        for (int i=0;i<words.length;i++){
            for (char c:words[i].toCharArray()){
                p[i]|=(1<<(c-'a'));
            }
        }
        int res=0;
        for (int i=0;i<words.length;i++){
            for (int j=i+1;j<words.length;j++){
                if ((p[i]&p[j])==0) res=Math.max(res,words[i].length()*words[j].length());
            }
        }
        return res;

    }
}
