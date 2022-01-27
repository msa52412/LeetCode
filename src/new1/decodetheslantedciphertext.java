package new1;

public class decodetheslantedciphertext {
    public static String decode(String en,int row){
        int len=en.length()/row;
        StringBuffer s=new StringBuffer("k");
        for (int i=0;i<len;i++){
            int y=0,x=i;
            while (y<row&&x<len){
                s.append(en.charAt(y*len+x));

                x++;
                y++;
            }
        }
        return s.toString().trim().substring(1);
    }
    public static void main(String[] aad){
        String a="ch   ie   pr";
        int l=3;
        System.out.println(decode(a,l));
    }


}
