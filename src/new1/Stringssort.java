package new1;

public class Stringssort {
    public static String getstring(String word){
        String[] strs=word.split(" ");
        int n= strs.length;
        String[] out=new String[n];
        for(String str:strs){
            int num =Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));


            out[num-1]=str.substring(0,str.length()-1);

        }

        return String.join(" ",out);

        }
        public static void main(String[] aw){
        String s="is2 sentence4 This1 a3";
        System.out.print(getstring(s));
        }
    }

