package hot100;

import java.util.*;

public class tuopu {
    List<List<Integer>> edges;
    int[] inedge;
    int[] result;
    int index;
    public int[] find(int num,int[][] everyedge){
        edges=new ArrayList<List<Integer>>();
        for (int i=0;i<num;i++){
            edges.add(new ArrayList<Integer>());
        }
        inedge=new int[num];
        result=new int[num];
        index=0;
        for (int[] info:everyedge){
            edges.get(info[1]).add(info[0]);
            inedge[info[0]]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i=0;i<num;i++){
            if (inedge[i]==0) queue.add(i);
        }
        while (!queue.isEmpty()){
            int node=queue.poll();
            result[index++]=node;
            for (int v:edges.get(node)){
                inedge[v]--;
                if (inedge[v]==0) queue.add(v);
            }
        }
        if (index!=num) return new int[0];
        return result;
    }

}
