package new1;

public class sowordToOffer45 {
    public String min(int[] num){
        String[] val=new String[num.length];
        for (int i=0;i<num.length;i++){
            val[i]=String.valueOf(num[i]);
        }
        quicksort(val,0,val.length-1);
        StringBuilder str=new StringBuilder();
        for (String s:val) str.append(s);
        return str.toString();
    }
    public void quicksort(String[] val,int l, int r){
        if (l>=r) return;
        int i=l,j=r;
        String tmp=val[l];
        while (i<j){
            while ((val[j]+val[l]).compareTo(val[l]+val[j])>=0&&i<j) j--;
            while ((val[i]+val[l]).compareTo(val[l]+val[i])<=0&&i<j) i++;
            tmp=val[i];
            val[i]=val[j];
            val[j]=tmp;
        }
        val[i]=val[l];
        val[l]=tmp;
        quicksort(val,l,i-1);
        quicksort(val,i+1,r);
    }
}
