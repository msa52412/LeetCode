package new1;

public class colorFillLcci {
    public int[][] flood(int[][] image,int i,int j,int newcolor){
        int old=image[i][j];
        fill(image,i,j,old,newcolor);
        return image;
    }
    public void fill(int[][] image,int i,int j,int old,int newcol){
        if (!isin(image,i,j)) return;;
        if (image[i][j]!=old) return;
        if (image[i][j]==-1) return;
        image[i][j]=-1;
        fill(image,i,j+1,old,newcol);
        fill(image,i,j-1,old,newcol);
        fill(image,i+1,j,old,newcol);
        fill(image,i-1,j,old,newcol);
        image[i][j]=newcol;
    }
    public boolean isin(int[][] image,int i,int j){
        return i>=0&&i<image.length&&j>=0&&j<image[0].length;
    }
}
