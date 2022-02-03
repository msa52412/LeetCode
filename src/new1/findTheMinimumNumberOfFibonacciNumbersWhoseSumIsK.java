package new1;

import java.util.TreeMap;
import java.util.TreeSet;

public class findTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {

    public static int findMinFibonacciNumbers(int k){
    if (k==0) return 0;
    int f1=1,f2=1;
    while (f2<=k){
        int f3=f1+f2;
        f1=f2;
        f2=f3;
    }
    return findMinFibonacciNumbers(k-f1)+1;
    }

    public static void main(String[] a){
        System.out.print(findMinFibonacciNumbers(30));
    }


}
