package new1;

import java.util.Scanner;

public class toStr {

    public static void main(String yvj[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String newstr="";
        char[] chars=str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='-'){
                if (chars[i+1]>='a'&&chars[i+1]<='z'){
                newstr+= (char) (chars[i+1]-32);
                i++;
                continue;}
                else {
                    newstr+=chars[i+1];
                    i++;
                    continue;
                }
            }
            newstr+=chars[i];
        }
        System.out.print(newstr);
        
    }
}
