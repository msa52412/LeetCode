package new1;

public class stringAdd {
    public static String add(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int len=Math.max(m,n);
        StringBuilder res=new StringBuilder();
        int mid=0;
        for (int i=0;i<len+1;i++){
            int eve=getnum(m-i-1,s1)+getnum(n-i-1,s2)+mid;
            res.append(eve%10);
            mid=eve/10;

        }
        if (res.charAt(len)=='0') res.deleteCharAt(len);
        return res.reverse().toString();
    }
    public static int getnum(int i,String s){
        return i>-1?s.charAt(i)-'0':0;
    }
    public static void main(String[] w){
        System.out.println(add("9","99"));
    }

}
