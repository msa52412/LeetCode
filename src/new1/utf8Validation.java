package new1;

import java.util.ArrayList;
import java.util.List;

public class utf8Validation {
    public boolean vaild(int[] data){
        int i=0;
        while (i<data.length){
            //0-127  192-223  224-239  240-247
            //128-191
            int s=data[i];
           if (s<128){
               i++;
           }
           else if (s>191&&s<224){
               if (i+1>=data.length||data[i+1]<128||data[i+1]>191) return false;
               i+=2;
           }
           else if (s>223&&s<240){
               if (i+2>=data.length||data[i+1]<128||data[i+1]>191) return false;
               if (data[i+2]<128||data[i+2]>191) return false;
                i+=3;
           }
           else if (s>239&&s<248){
               if (i+3>=data.length||data[i+1]<128||data[i+1]>191) return false;
               if (data[i+2]<128||data[i+2]>191) return false;
               if (data[i+3]<128||data[i+3]>191) return false;
               i+=4;
           }
           else return false;
        }
        return true;
    }
    public static List<Integer> find(int[] nums,int key,int k){
        List<Integer> res=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        if (nums.length==0) return res;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==key) p.add(i);
        }
        for (int i=0;i<nums.length;i++){
            int l=0,r=p.size()-1;
            while (l<=r){
            int mid=(l+r)/2;
            if (p.get(mid)-k<=i&&p.get(mid)+k>=i){
                res.add(i);
                break;
            }
            else if (p.get(mid)-k>i){
                r=mid-1;
            }
            else if (p.get(mid)+k<i){
                l=mid+1;
            }
            }
        }


        return res;
    }

    public static void main(String[] args) {
        List<Integer> r=find(new int[]{3,4,9,1,3,9,5},9,1);
        for (int k:r) System.out.println(k);
    }

}
