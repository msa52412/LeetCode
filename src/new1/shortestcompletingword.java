package new1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class shortestcompletingword {
    public static String getchar(String l, String[] w){
        l=l.toLowerCase();

        int[] charnum=new int[27];
        for (int i=0;i<l.length();i++) {
            char ch=l.charAt(i);
            if (ch>='a'&&ch<='z'){
                charnum[(byte)ch-96]+=1;
            }
        }

        int last =16;
        String res = null;
        for (int j=0;j<w.length;j++) {
               
               String word=w[j];
               if (word.length()<last){
                   int[] d=charnum.clone();
                   if(che(d,word)){
                       last=word.length();
                       res=word;
                   }
               }
        }
        return res;
        

    }
    public static boolean che(int[] arr,String word){
        int n=word.length();
        for (int i=0;i<n;i++){
            arr[(byte)word.charAt(i)-96]-=1;
        }
        for (int num:arr){
            if (num>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] a ){
        String all="ad";
        String[] words={"pressure","attack","first","these","town","enough","this","while","beat","data","crime","seek","stand","fish","prepare","college","under","kid","use","ever","ask","need","technology","ten","lie","help","sell","movement","develop","indeed","kill","could","budget","simple","girl","cause","state","yes","fact","must","pretty","affect","trouble","minute","grow","heat","within","structure","fall","child","herself","fight","risk","project","problem","prove","find","probably","operation","bad","perhaps","various","growth","at","president","daughter","open","all","account","away","democratic","father","serve","race","ok","bring","with","about","through","hospital","me","build","move","present","throughout","police","serious","education","reason","letter","sort","car","language","believe","report","worker","create","boy","stop","everyone","identify","worry","behavior","generation","turn","measure","begin","marriage","activity","owner","woman","music","nearly","free","story","certain","most","why","foot","available","skill","throw","company","safe","over","billion","south","hold","hit","as","alone","somebody","describe","election","economic","maybe","inside","leader","one","camera","three","our","economy","face","should","period","nature","study","type","add"};
        System.out.print(getchar(all,words));

    }

}
