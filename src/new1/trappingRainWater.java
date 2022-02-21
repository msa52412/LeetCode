package new1;

public class trappingRainWater {
    public static int trap(int[] h){
        if (h.length==0||h.length==1) return 0;
        int[] l=new int[h.length];
        int[] r=new int[h.length];
        l[1]=h[0];r[h.length-2]=h[h.length-1];
        for (int i=2;i<h.length;i++){
            l[i]=Math.max(l[i-1],h[i-1]);
        }
        for (int i=h.length-3;i>0;i--){
            r[i]=Math.max(r[i+1],h[i+1]);
        }

        int res=0;
        for (int i=1;i<h.length-1;i++){
            int eve=Math.min(l[i],r[i])-h[i];
            if (eve>0) res+=eve;
        }
        return res;
    }
    public static void main(String[] a){
        System.out.print(trap(new int[]{4,2,0,3,2,5}));
    }
}
