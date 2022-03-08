package new1;

public class platesBetweenCandles {
    public  int[] plates(String s,int[][] que){
        char[] c=s.toCharArray();
        int n=s.length();
        int[] res=new int[que.length];
        int[] l=new int[n],r=new int[n];
        int[] pos=new int[n+1];
        int lp=-1,rp=-1;
        for (int i=0,j=n-1;i<n;i++,j--){
            if (c[i]=='|') lp=i;
            if (c[j]=='|') rp=j;
           l[i]=lp;
           r[j]=rp;
           pos[i+1]=pos[i]+(c[i]=='|'?0:1);
        }
        for (int i=0;i<que.length;i++){
            int lpos=que[i][0],rpos=que[i][1];
            int m=r[lpos],k=l[rpos];
            if (m!=-1&&m<k) res[i]=pos[k+1]-pos[m];
        }
        return res;

    }


}
