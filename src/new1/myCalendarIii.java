package new1;

import java.util.HashMap;
import java.util.TreeMap;

public class myCalendarIii {
    TreeMap<Integer,Integer> date;
    public myCalendarIii(){
       date= new TreeMap<Integer, Integer>();
    }
    public int book(int s,int e){
        date.put(s,date.getOrDefault(s,0)+1);
        date.put(e,date.getOrDefault(e,0)-1);
        int max=0,nums=0;
        for (int num:date.values()){
            nums+=num;
            max=Math.max(max,nums);
        }
        return max;

    }

}
