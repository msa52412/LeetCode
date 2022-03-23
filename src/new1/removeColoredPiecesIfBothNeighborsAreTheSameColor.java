package new1;

public class removeColoredPiecesIfBothNeighborsAreTheSameColor {
    public static boolean win(String s){
        int r1=0,r2=0,res1=0,res2=0;
        for (char c:s.toCharArray()){
            if (c=='A'){
                if (r1>=2) {
                    res1++;
                }
                r1++;
                r2=0;
            }
            else {
                if (r2>=2) {
                    res2++;
                }
                r2++;
                r1=0;
            }
        }
        return res1>res2;
    }

    public static void main(String[] args) {
        System.out.println(win("ABBBBBBBAAA"));
    }
}
