package new1;

import java.util.Stack;

public class calculate {
    public int cal(String s){
        Stack<Integer> stk=new Stack<Integer>();
        int num=0;
        char sign='+';
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if (!Character.isDigit(c)||i==s.length()-1){
                int pre;
                switch (sign){
                    case '+':
                        stk.push(num);break;
                    case '-':
                        stk.push(-num);break;
                    case '*':
                        pre=stk.peek();
                        stk.push(pre*num);
                        break;
                    case '/':
                        pre=stk.peek();
                        stk.push(pre/num);
                        break;
                }
                sign=c;
                num=0;
            }
        }
        int res=0;
        while (!stk.isEmpty()){
            res+=stk.peek();

        }
        return res;
    }

}
