package Sword;

public class swordToOffer2 {
    public String add(String a,String b){
        if (a.length()==0) return b;
        if (b.length()==0) return a;
        char[] ac=a.toCharArray();
        char[] bc=b.toCharArray();
        int i=ac.length-1,j=bc.length-1;
        int pre=0;
        StringBuilder res=new StringBuilder();
        while (i>-1||j>-1){
            if (i==-1){
                int now=(bc[j]-'0')+pre;
                res.append( (char) ('0'+now%2));
                pre=now/2;
                j--;
            }
            else if (j==-1){
                int now=(ac[i]-'0')+pre;
                res.append( (char) ('0'+now%2));
                pre=now/2;
                i--;

            }
            else {
                int now=(ac[i]-'0')+(bc[j]-'0')+pre;
                res.append( (char) ('0'+now%2));
                pre=now/2;
                i--;
                j--;

            }
        }
        if (pre==0) {
        }
        else {
            res.append('1');
        }
        return res.reverse().toString();
    }
}
