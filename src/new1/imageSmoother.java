package new1;

import java.util.Arrays;

public class imageSmoother {
    static int[][] d;
    public static int[][] image(int[][] img){
        if (img.length==0) return img;
        d=new int[][]{{0,0},{0,1},{0,-1},{1,0},{1,1},{1,-1},{-1,0},{-1,-1},{-1,1}};
        int[][] res=new int[img.length][img[0].length];
        for (int i=0;i<img.length;i++){
            for (int j=0;j<img[0].length;j++){
                res[i][j]=get(img,i,j);
            }
        }
        return res;
    }
    public static int get(int[][] img,int i,int j){
        int all=0;
        int len=0;
        for (int[] dxy:d){
            if (i+dxy[0]>=0&&i+dxy[0]<img.length&&j+dxy[1]>=0&&j+dxy[1]<img[0].length){
                all+=img[i+dxy[0]][j+dxy[1]];
                len++;
            }
        }
        return all/len;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(image(new int[][]{{2,3}})));
    }
}
