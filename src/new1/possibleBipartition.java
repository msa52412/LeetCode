package new1;

import java.util.*;


public class possibleBipartition {
    private static final int uncolor=0;
    private static final int red=1;
    private static final int green=2;
    private static int[] color;
    private static boolean vaild=true;

    public static boolean possibleTwo(int n, int[][] dislikes){
        ArrayList<Integer>[] graph=new ArrayList[n];
        color=new int[n];
        for (int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for (int[] cp:dislikes){
            graph[cp[0]-1].add(cp[1]-1);
            graph[cp[1]-1].add(cp[0]-1);
        }
        for(ArrayList<Integer> a:graph){
            System.out.println(a);
        }
        for (int i=0;i<n;i++){
            if (color[i]==uncolor){
                dfss(i,0,graph);
            }
        }
        return vaild;
    }
    public static void dfss(int node, int c, ArrayList<Integer>[] graph){
        color[node]=c;
        int notcolor=c==red?green:red;
        for (int nei:graph[node]){
            if (color[nei]==uncolor){
                dfss(nei,notcolor,graph);
                if (!vaild) return;
            }
            else if (color[nei]!=notcolor){
                vaild=false;
                return;
            }
        }

    }
    public static void main(String [] a){
        int[][] n={{1,2},{2,0},{1,0}};
        int[][] t={{1,2},{1,3},{2,3}};
        System.out.print(possibleTwo(3,t));
    }
}

