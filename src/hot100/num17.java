package hot100;

import java.util.ArrayList;
import java.util.List;

public class num17 {
    public List<String> letter(String dig){
        res=new ArrayList<>();
        if (dig.length()==0) return res;
        append= new String[]{"", "abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder s=new StringBuilder();
        length=dig.length();
        this.dig=dig;
        dfs(0,s);
        return res;
    }
    List<String> res;
    String[] append;
    int length;
    String dig;
    public void dfs(int len,StringBuilder stringBuilder){
        if (len==length) {
            res.add(stringBuilder.toString());
            return;
        }
        for (char c:append[dig.charAt(len)-'0'-1].toCharArray()){
            stringBuilder.append(c);
            dfs(len+1,stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
