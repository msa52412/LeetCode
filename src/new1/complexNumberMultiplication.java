package new1;

public class complexNumberMultiplication {
    public String comp(String n1,String n2){
        String[] s1=n1.split("\\+|i"),s2=n2.split("\\+|i");
        int a1=Integer.parseInt(s1[0]);
        int b1=Integer.parseInt(s1[1]);
        int a2=Integer.parseInt(s2[0]);
        int b2=Integer.parseInt(s2[1]);
        return String.format("%d+%di",a1*a2-b1*b2,a1*b2+a2*b1);
    }
}
