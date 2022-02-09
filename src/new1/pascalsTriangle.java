package new1;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static List<List<Integer>> gener(int rows){
        int row=1;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        res.add(a);
        List<Integer> last=new ArrayList<>();
        while (row<rows){
            last=res.get(res.size()-1);
            List<Integer> re=new ArrayList<>();
            re.add(1);
            for (int i=0;i<last.size()-1;i++) {
                re.add(last.get(i) + last.get(i+1));
            }
            row++;
            re.add(1);
            res.add(re);


        }
        return res;
    }
    public static void main(String [] a){
        for (List<Integer> i:gener(5)){
            for (Integer k:i){
                System.out.println(k);
            }
        }
    }
}
