package new1;

import java.util.ArrayList;
import java.util.HashMap;

public class uncommonWordsFromTwoSentences {
    public String[] getWord(String s1,String s2){
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> res=new ArrayList<>();

        String[] word1s=s1.split(" ");
        String[] word2s=s2.split(" ");
        for (String word1:word1s){
            map.put(word1,map.getOrDefault(word1,0)+1);

        }
        for (String word2:word2s){
            map.put(word2,map.getOrDefault(word2,0)+1);

        }
        for (String word: map.keySet()){
            if(map.get(word)==1){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);


    }
}
