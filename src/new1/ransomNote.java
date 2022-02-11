package new1;

public class ransomNote {
    public boolean canConstruct(String r,String m){
        int[] arr=new int[26];
        for (char c:m.toCharArray()){
            arr[c-'a']++;
        }
        for (char c:r.toCharArray()){
            arr[c-'a']--;

        }
        for (int i:arr) if (i!=0) return false;
        return true;
    }
}
