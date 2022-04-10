package new1;

import java.lang.reflect.Array;
import java.util.*;

public class swordToOffer58 {
    public static String rever(String s){
        if (s.length()==0) return s;
        if (s.length()==1) {
            if (s.equals(" ")) return "";
            else return s;
        }
        ArrayList<String> res=new ArrayList<>();
        char[] m=s.toCharArray();
        int l = 0,r=0;
        while (m[l]==' ') {
            l++;
            if (l==s.length()) return "";
        }
        r=l;
        while (true){
            StringBuilder sb=new StringBuilder();
            while (m[r]!=' ') {
                sb.append(m[r]);
                r++;
                if (r==m.length) break;
            }
            res.add(sb.toString());
            while (true){
                r++;
                if (r==m.length||r==m.length+1) break;
                if (m[r]!=' ') break;
            }
            if (r==m.length||r==m.length+1) break;
        }
        StringBuilder ress=new StringBuilder();
        for (int i=res.size()-1;i>0;i--){
            ress.append(res.get(i)).append(" ");
        }
        ress.append(res.get(0));
        return ress.toString();


    }

    public String find(String s){
        s=s.trim();
        String[] str=s.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i=str.length-1;i>=0;i--){
            if (str[i].equals("")) continue;
            res.append(str[i]+" ");
        }
        return res.toString().trim();
    }
    public String reverse(String s,int k){
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        for (int i=k;i<c.length;i++){
            sb.append(c[i]);
        }
        for (int i=0;i<k;i++) sb.append(c[i]);
        return sb.toString();
    }
    public static int[] max(int[] nums,int k){
        if(nums.length==0) return nums;
        Deque<Integer> queue=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        for (int i=0;i<k;i++){
            while (!queue.isEmpty()&&nums[queue.peekLast()]<nums[i]) queue.pollLast();
            queue.addLast(i);
        }
        int i=0,j=k-1;
        while (true){
            while (queue.peekFirst()<j-k+1) queue.pollFirst();
            res[i]=nums[queue.peekFirst()];
            i++;
            j++;
            if (i==res.length||j==nums.length) break;
            while (!queue.isEmpty()&&nums[queue.peekLast()]<nums[j]) queue.pollLast();
            queue.addLast(j);

        }
        return res;
    }

    public static void main(String[] args) {
        max(new int[]{1,3,-1,-3,5,3,6,7},3);
    }
}
