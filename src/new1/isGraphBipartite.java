package new1;

import java.util.LinkedList;
import java.util.Queue;

public class isGraphBipartite {
    private static final int uncolor=0;
    private static final int red=1;
    private static final int green=2;
    private static int[] color;
    private static boolean vaild=true;
    public static boolean isTwo(int[][] graph){
        int n=graph.length;
        color=new int[n];
        for (int i=0;i<n;i++){
            if (color[i]==uncolor){
                dfs(i,red,graph);
            }
        }
        return vaild;
    }
    public static void dfs(int node, int c, int[][] graph){
        color[node]=c;
        int notcolor=c==red?green:red;
        for (int neighbor:graph[node]){
            if (color[neighbor]==uncolor){
                dfs(neighbor,notcolor,graph);
                if(!vaild) return;
            }
            else if (color[neighbor]!=notcolor){
                vaild=false;
                return;
            }
        }
    }
    public boolean isTwoBFS(int[][] graph){
        int n=graph.length;
        color=new int[n];
        for (int i=0;i<n;i++){
            if (color[i]==uncolor){
                Queue<Integer> queue=new LinkedList<Integer>();
                queue.offer(i);
                color[i]=red;
                while (!queue.isEmpty()){
                    int node=queue.poll();
                    int notcolor=color[node]==red?green:red;
                    for (int neighbor:graph[node]){
                        if (color[neighbor]==uncolor){
                            queue.offer(neighbor);
                            color[neighbor]=notcolor;
                        }
                        else if (color[neighbor]!=notcolor){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String [] a){
        int[][] n={{1,2},{2,0},{1,0}};
        System.out.print(isTwo(n));
    }




}
