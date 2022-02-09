package new1;

public class minimumAddToMakeParenthesesValid2 {
    public int getAdd(String s){
        int res=0,left=0;
        for (char c:s.toCharArray()) {
            if (c=='('){
                left+=2;
                if (left%2==1){
                    left--;
                    res++;
                }
            }
            else {
                left--;
                if (left==-1) {
                    left=1;
                    res++;
                }
            }

        }
        return res+left;
    }

}
