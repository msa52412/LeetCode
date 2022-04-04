package new1;

import java.util.PriorityQueue;
import java.util.Queue;

public class swordToOffer41 {
    Queue<Integer> heap1;
    Queue<Integer> heap2;
    public swordToOffer41(){
        this.heap1=new PriorityQueue<>((i1, i2)->Integer.compare(i2,i1));//大顶堆
        this.heap2=new PriorityQueue<>();//小顶堆
    }
    public void add(int num){
        if (heap2.size()==heap1.size()) {
            heap2.offer(num);
            heap1.add(heap2.poll());
            return;
        }
        heap1.add(num);
        heap2.add(heap1.poll());


    }
    public double find(){
        return heap2.size()==heap1.size()?(heap2.peek()+ heap1.peek())/2.0: heap1.peek();
    }


}
