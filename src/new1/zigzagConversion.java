package new1;

public class zigzagConversion {
    public  String con(String s,int num){
        if (num==1) return s;
        StringBuilder[] res=new StringBuilder[num];
        for (int i=0;i<num;i++) res[i]= new StringBuilder();
        int dy=-1,id=0;
        for (int i=0;i<s.length();i++){
            res[id].append(s.charAt(i));
            if (id==0||id==num-1) dy=-dy;
            id+=dy;
        }
        StringBuilder r=new StringBuilder();
        for (int i=0;i<num;i++) r.append(res[i]);
        return r.toString();
    }
}
