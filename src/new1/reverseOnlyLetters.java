package new1;

public class reverseOnlyLetters {
    public String rever(String s){
        char[] c=s.toCharArray();
        int l=0,r=c.length-1;
        while (true){
            while (l<r&&!Character.isLetter(c[l])) l++;
            while (r>l&&!Character.isLetter(c[r])) r--;
            if (l>=r) break;
            char m=c[l];
            c[l]=c[r];
            c[r]=m;
            l++;
            r--;
        }
        return new String(c);

    }

}
