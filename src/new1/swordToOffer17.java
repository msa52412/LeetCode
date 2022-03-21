package new1;

import java.util.ArrayList;

public class swordToOffer17 {
    public static int[] prin(int n){
        int m= (int) Math.pow(10,n);
       int[] res=new int[m-1];
       for (int i=0;i<m-1;i++){
           res[i]=i+1;
       }
       return res;
    }
    public static String[] pr(int n){
        ArrayList<String> res=new ArrayList<>();
        String s="1";
        while (s.length()<=n){
            res.add(s);
            s=cou(s,"1");
        }
        String[] re=new String[res.size()];
        return res.toArray(re);
    }
    public static String cou(String a,String b){
        if (a.equals("0")) return b;
        if (b.equals("0")) return a;
        int i=a.length()-1,j=b.length()-1,last=0;
        StringBuilder s=new StringBuilder();
        while (i>=0||j>=0||last!=0){
            int x=i>=0?a.charAt(i)-'0':0;
            int y=j>=0?b.charAt(j)-'0':0;
            int result=x+y+last;
            s.append(result%10);
            last=result/10;
            i--;
            j--;
        }
        return s.reverse().toString();
    }
    public static String couu(String a,String b){
        if (a.equals("0")||b.equals("0")) return "0";
        int[] res=new int[a.length()+b.length()];
        for (int i=a.length()-1;i>=0;i--){
            int n1=a.charAt(i)-'0';
            for (int j=b.length()-1;j>=0;j--){
                int n2=b.charAt(i)-'0';
                int sum=res[i+j+1]+n1*n2;
                res[i+j+1]=sum%10;
                res[i+j]=sum/10;
            }
        }
        StringBuilder r=new StringBuilder();
        for (int i=0;i<res.length;i++){
            if (i==0&&res[i]==0) continue;
            r.append(res[i]);
        }
        return r.toString();
    }

    public static void main(String[] args) {
        for (int m:prin(3)){
            System.out.println(m);
        }
    }
}
