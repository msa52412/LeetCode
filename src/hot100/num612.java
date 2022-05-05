package hot100;

import java.util.HashMap;
import java.util.List;

public class num612 {
    public int least(char[] task,int n){
        if (n==0) return task.length;
        int[] lasttime=new int[26];
        int[] everylen=new int[26];
        for (char t:task){
            lasttime[t-'A']=-100000;
            everylen[t-'A']++;
        }
        int all=0;
        int time=0;
        while (all<task.length){
            int maxi=Integer.MIN_VALUE;
            int i=0;
            int lastlen= Integer.MIN_VALUE;
            while (i<26){
                if (everylen[i]>0&&(lasttime[i]+n<time||lasttime[i]==-100000)&&time-lasttime[i]-n>lastlen){
                    lastlen=time-lasttime[i]-n;
                    maxi=i;
                }
                i++;

            }
            i=0;
            while (i<26){
                if (everylen[i]>0&&(lasttime[i]+n==time-1)&&time-lasttime[i]-n>lastlen){
                    lastlen=time-lasttime[i]-n;
                    maxi=i;
                }
                i++;

            }
            if (maxi==Integer.MIN_VALUE){
                time++;
                continue;
            }
            everylen[maxi]--;
            lasttime[maxi]=time;
            time++;
            all++;
        }
        return time;
    }
    public int cpu(char[] task,int n){
        int[] temp=new int[26];
        int maxtask=0;
        int countmax=0;
        for (var c:task){
            temp[c-'A']++;
            maxtask=Math.max(temp[c-'A'],maxtask);
        }
        for (int i=0;i<26;i++){
            if (temp[i]==maxtask){
                countmax++;
            }
        }
        return Math.max(task.length,(maxtask-1)*(n+1)+countmax);
    }
}
