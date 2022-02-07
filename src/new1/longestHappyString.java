package new1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class longestHappyString {
    public String longest(int a,int b,int c){
        StringBuffer s=new StringBuffer();
        PriorityQueue<int[]> q=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        if (a>0) q.add(new int[]{0,a});
        if (b>0) q.add(new int[]{1,b});
        if (c>0) q.add(new int[]{2,c});
        while (!q.isEmpty()){
            int[] curr=q.poll();
            int n=s.length();
            if (n>=2&&s.charAt(n-1)-'a'==curr[0]&&s.charAt(n-2)-'a'==curr[0]){
                if (q.isEmpty()) break;
                int[] next=q.poll();
                s.append((char) (next[0]+'a'));
                next[1]-=1;
                if (next[1]!=0) q.add(next);
                q.add(curr);
            }
            else {
                s.append((char) (curr[0]+'a'));
                curr[1]-=1;
                if (curr[1]!=0) q.add(curr);
            }
        }
        return s.toString();
    }

}
