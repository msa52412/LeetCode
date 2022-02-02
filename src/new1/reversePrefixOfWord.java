package new1;

public class reversePrefixOfWord {
    public String getWord(String word,char c){
        int index=word.indexOf(c);
        if (index>0){
            char[] words=word.toCharArray();
            int l=0,r=index;
            char tmp;
            while(l<r){
                tmp=words[l];
                words[l]=words[r];
                words[r]=tmp;
                l++;r--;
            }
            word=new String(words);
        }

        return word;
    }
}
