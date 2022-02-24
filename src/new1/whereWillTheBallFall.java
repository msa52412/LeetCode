package new1;

public class whereWillTheBallFall {
    public static int[] find(int[][] grid){
        int[] res=new int[grid[0].length];
        for (int i=0;i<grid[0].length;i++){
            int eve=i;
            int d=0;
            while (d<grid.length){
                int next=eve+grid[d][eve];
                if (next<0||next>=grid[0].length||grid[d][eve]!=grid[d][next]){
                    eve=-1;
                    break;
                }
                d++;
                eve=next;

            }
            res[i]=eve;

        }
        return res;
    }
    public static void main(String[] a){
        for(int i:find(new int[][]{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}}))
        {
            System.out.println(i);
        }
    }
}
