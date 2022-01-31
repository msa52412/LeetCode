package new1;

public class numberOfStepsToReduceNumberToZero {
    public int numberOfSteps(int num) {
        return num>0?(int)(Math.log(num)/Math.log(2))+Integer.bitCount(num):num;

    }
}
