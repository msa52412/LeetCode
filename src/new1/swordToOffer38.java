package new1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class swordToOffer38 {
    private Set<String> res;
    private StringBuilder ress;
    public String[] pre(String s){
        ress=new StringBuilder();
       res=new HashSet<>();
        char[] c=s.toCharArray();
        boolean[] is=new boolean[c.length];
        get(c,is);
        return res.toArray(new String[0]);
    }
    public void get(char[] c,boolean[] is){
        if (ress.length()==c.length) {
            res.add(ress.toString());
            return;
        }
        for (int i=0;i<c.length;i++){
            if (!is[i]) {
                ress.append(c[i]);
                is[i]=true;
                get(c,is);
                ress.deleteCharAt(ress.length()-1);
                is[i]=false;
            }
        }

    }
}
