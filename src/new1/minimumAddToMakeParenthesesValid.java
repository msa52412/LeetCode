package new1;

public class minimumAddToMakeParenthesesValid {
    public int minAdd(String s){
        int left=0,res=0;
        for (char c:s.toCharArray()){
            if (c=='(') left++;
            else {
                left--;
                if (left==-1) {
                    left=0;
                    res++;
                }
            }
        }
        return res+left;
    }
}
