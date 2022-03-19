package new1;

import java.util.Arrays;

public class swordToOffer5 {
    public String replace(String s){
        int need=0;
        for (char c:s.toCharArray()){
            if (c==' ') need++;
        }
        char[] res=new char[s.length()+need*2];
        int i=0;
        for (char c:s.toCharArray()){
            if (c==' '){
                res[i]='%';
                res[i+1]='2';
                res[i+2]='0';
                i+=3;
            }
            else {
                res[i]=c;
                i++;
            }
        }
        return new String(res);
    }
}
