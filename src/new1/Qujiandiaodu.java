package new1;

import java.util.Arrays;
import java.util.Comparator;

public class Qujiandiaodu {

	public static void main(String[] aw) {
		
	    int[][] inter={
			{1,2},{2,3},{3,4},{1,3}
		};
			
		
		
	
	System.out.print(getnum(inter));	
	
	}
	

	public static int getnum(int[][] inter) {
		if (inter.length==0) return 0;
		Arrays.sort(inter, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				// TODO 自动生成的方法存根
				if (a[1]>b[1]){
					return 1;
				}
				else if(a[1]==b[1]){
					return 0;
				}
				else return -1;
			}
			
			
		});
		int count=1;
		int end =inter[0][1];
		for(int[] inter1:inter) {
			int start =inter1[0];
			if(start>=end) {
				count++;
				end=inter1[1];
			}
		}
		return count;
	}

}
