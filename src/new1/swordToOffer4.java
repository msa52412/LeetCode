package new1;

public class swordToOffer4 {
    public static boolean find(int[][] mar,int tar){
        if (tar>mar[mar.length-1][mar[0].length-1]||tar<mar[0][0]) return false;
        int i=0;
        int j=mar[0].length-1;
        while (true){
            if (mar[i][j]==tar) return true;
            if (mar[i][j]<tar) {
                i++;
                if (i==mar.length) break;
        }
            if (mar[i][j]>tar){
                j--;
                if (j==-1) break;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},
                5));
    }
}
